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
public class Response<T> {
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

	public Response() {
		resultCode = CODE_OK;
		resultMsg = MSG_OK;
	}

	public Response(String resultCode, String resultMsg) {
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
	public static <T> Response<T> ok(T data, String sign) {
		Response<T> response = new Response<>();
		response.setData(data);
		response.setSign(sign);
		return response;
	}

	/**
	 * 成功结果
	 *
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> Response<T> ok(T data) {
		Response<T> response = new Response<>();
		response.setData(data);
		return response;
	}


	/**
	 * 失败结果
	 *
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> Response<T> error(T data) {
		Response<T> response = new Response<>();
		response.setData(data);
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
	public static <T> Response<T> error(String code, String msg, T data) {
		Response<T> response = new Response<>(code, msg);
		response.setData(data);
		return response;
	}

	/**
	 * 失败结果
	 *
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> Response<T> error(Exception exception, T data) {
		return errorException(exception, data);
	}

	/**
	 * 失败结果
	 * @param data
	 * @param      <T>
	 * @return
	 */
	public static <T> Response<T> errorException(Exception exception, T data) {
		Response<T> response = new Response<>();
		response.setData(data);
		response.setResultMsg(exception.getMessage());
		return response;
	}
}
