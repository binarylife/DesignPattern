package com.feng.designpattern.桥接模式.mode;

/**
 * Created by fengbei
 * on 20-10-30
 * 支付方式
 * 任何一一个支支付模式;刷脸、指纹、密码,都会过不不同程度的安全⻛风控,这里里里定义一一个安全校验接
 * 口口。
 */
public interface IPayMode {


    /**
     * 支付方式校验
     *
     * @param uId
     * @return
     */
    boolean security(String uId);
}
