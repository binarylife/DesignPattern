package com.feng.designpattern.责任链模式;

import java.util.Date;

/**
 * Created by fengbei
 * on 20-11-10
 * 链路抽象类
 */
public abstract class AuthLink {

    protected String levelUserId;
    protected String levelUserName;

    private AuthLink next;


    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }


    /**
     * @param uId
     * @param orderId
     * @param authDate
     * @return
     */
    public abstract AuthLink doAuth(String uId, String orderId, Date authDate);
}
