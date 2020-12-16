package com.feng.designpattern.结构型.桥接模式.mode;

/**
 * Created by fengbei
 * on 20-10-30
 * 面部识别
 */
public class PayCypherMode implements IPayMode {
    public String TAG = this.getClass().getSimpleName();

    @Override
    public boolean security(String uId) {
        System.out.println("密码支付，风控校验环境安全");
        return true;
    }
}
