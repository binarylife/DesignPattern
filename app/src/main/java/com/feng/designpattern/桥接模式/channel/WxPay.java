package com.feng.designpattern.桥接模式.channel;

import android.util.Log;

import com.feng.designpattern.桥接模式.mode.IPayMode;

import java.lang.annotation.Target;
import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-30
 */
public class WxPay extends IPay {


    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("模拟微信渠道支支付划账开始。uId:{} tradeId:{} amount:{}");
        boolean security = payMode.security(uId);
        if (!security) {
            System.out.println("模拟微信渠道支支付划账拦截。uId:{} tradeId:{} amount:{}");
            return "0001";
        }
        System.out.println("模拟微信渠道支支付划账成功。。uId:{} tradeId:{} amount:{}");
        return "0000";
    }
}
