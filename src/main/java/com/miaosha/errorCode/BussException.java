package com.miaosha.errorCode;

/**
 * Created by admin on 2019/6/11.
 */
public class BussException extends Exception implements CommonError{

    private CommonError commonError;

    public BussException (CommonError commonError) {
        super();
        this.commonError=commonError;
    }

    public BussException (CommonError commonError,String errMsg) {
        super();
        this.commonError=commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
