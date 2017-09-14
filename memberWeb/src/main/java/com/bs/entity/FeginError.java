package com.bs.entity;

/**
 * Created by liuxl on 2017/9/13.
 */
public class FeginError extends BaseDO {

    private String code;
    private String errMsg;

    public FeginError() {
        super();
    }

    public FeginError(String code, String errMsg) {
        super();
        this.code = code;
        this.errMsg = errMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
