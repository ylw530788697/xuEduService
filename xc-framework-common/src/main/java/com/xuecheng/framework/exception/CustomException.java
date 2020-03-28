package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 03/28/2020 14:01
 */
@Data
public class CustomException extends RuntimeException {
    //错误代码
    ResultCode resultCode;
    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
    }
    public ResultCode getResultCode(){
        return resultCode;
    }
}
