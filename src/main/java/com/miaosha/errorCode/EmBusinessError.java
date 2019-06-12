package com.miaosha.errorCode;

/**
 * Created by admin on 2019/6/11.
 */
public enum  EmBusinessError implements CommonError {

    //通用错误类型
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法") ,
    //未知错误
    UNKNOWN_ERROR(10002,"未知错误"),
    //"10000" 为用户错误
    USER_NOT_EXIST(1001,"用户信息错误")
    ;
    private int errCode;
    private String errMsg;

    private EmBusinessError (int errCode,String errMsg) {
        this.errCode=errCode;
        this.errMsg=errMsg;
    }

    @Override
    public int getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg=errMsg;
        return this;
    }
}
