package com.feng.designpattern.结构型.桥接模式.channel;

import com.feng.designpattern.结构型.桥接模式.mode.IPayMode;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-30
 */
public class AliPay extends IPay {


    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("模拟支付宝渠道支支付划账开始。uId:{} tradeId:{} amount:{}");
        boolean security = payMode.security(uId);
        if (!security) {
            System.out.println("模拟支付宝渠道支支付划账拦截。uId:{} tradeId:{} amount:{}");
            return "0001";
        }
        System.out.println("模拟支付宝渠道支支付划账成功。。uId:{} tradeId:{} amount:{}");
        return "0000";
    }
}
