package com.miaosha.errorCode;

/**
 * Created by admin on 2019/6/11.
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);

}
