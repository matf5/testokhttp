package com.android.testokhttp.jsonbean;

/**
 * Created by Administrator on 2016/4/18.
 */
public class ResponseJson {

    /**
     * state : 1
     * code : 10000
     * return_info : 错误信息
     * body : {}
     */

    private Boolean state;
    private String code;
    private String return_info;
    private BodyBean body;

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReturn_info() {
        return return_info;
    }

    public void setReturn_info(String return_info) {
        this.return_info = return_info;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public static class BodyBean {
    }
}
