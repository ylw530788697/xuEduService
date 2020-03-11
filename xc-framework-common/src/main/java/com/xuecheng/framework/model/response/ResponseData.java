package com.xuecheng.framework.model.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 请求响应结果
 * 
 * @author EvanYang
 *
 * @param <T>
 */
@ApiModel(description = "返回对象")
@Data
public class ResponseData<T> {
	public final static String CODE_OK = "200";
	public final static String MSG_OK = "ok";
	public final static String CODE_ERROR = "5000";
	public final static String MSG_ERROR = "error";
	@ApiModelProperty(value = "返回码，200为成功，其他为失败", required = true)
	private String resultCode;
	@ApiModelProperty(value = "返回码描述", required = true)
	private String resultMsg;
	@ApiModelProperty(value = "结果签名", required = true)
	private String sign;
	@ApiModelProperty(value = "详细数据", required = false)
	private T data;

	public ResponseData() {
		resultCode = CODE_OK;
		resultMsg = MSG_OK;
	}

	public ResponseData(String resultCode, String resultMsg) {
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}

	/**
	 * 成功结果
	 *
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> ResponseData<T> ok(T data, String sign) {
		ResponseData<T> responseData = new ResponseData<>();
		responseData.setData(data);
		responseData.setSign(sign);
		return responseData;
	}

	/**
	 * 成功结果
	 *
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> ResponseData<T> ok(T data) {
		ResponseData<T> responseData = new ResponseData<>();
		responseData.setData(data);
		return responseData;
	}


	/**
	 * 失败结果
	 *
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> ResponseData<T> error(T data) {
		ResponseData<T> responseData = new ResponseData<>();
		responseData.setData(data);
		return error(CODE_ERROR, MSG_ERROR, data);
	}

	/**
	 * 失败结果
	 *
	 * @param code
	 * @param msg
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> ResponseData<T> error(String code, String msg, T data) {
		ResponseData<T> responseData = new ResponseData<>(code, msg);
		responseData.setData(data);
		return responseData;
	}

	/**
	 * 失败结果
	 *
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> ResponseData<T> error(Exception exception, T data) {
		return errorException(exception, data);
	}

	/**
	 * 失败结果
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> ResponseData<T> errorException(Exception exception, T data) {
		ResponseData<T> responseData = new ResponseData<>();
		responseData.setData(data);
		responseData.setResultMsg(exception.getMessage());
		return responseData;
	}
}
