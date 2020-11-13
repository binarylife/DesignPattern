package com.feng.designpattern.责任链模式;

/**
 * Created by fengbei
 * on 20-11-10
 */
public class AuthInfo {

    private String code;
    private String info = "";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            this.info = this.info.concat(str);
        }
    }
}
