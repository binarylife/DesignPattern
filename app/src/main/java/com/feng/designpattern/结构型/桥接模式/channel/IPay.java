package com.feng.designpattern.结构型.桥接模式.channel;

import com.feng.designpattern.结构型.桥接模式.mode.IPayMode;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-30
 */
public abstract class IPay {
    protected IPayMode payMode;
    public String TAG = this.getClass().getSimpleName();


    public IPay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 统一支付接口
     *
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
