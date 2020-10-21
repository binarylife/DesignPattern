package com.feng.designpattern.工厂方法模式.Store.impl;

import android.util.Log;

import com.feng.designpattern.工厂方法模式.Store.ICommodity;

import java.util.Map;

/**
 * Created by fengbei
 * on 20-10-21
 * 发放奖品为优惠劵
 */
public class CouponCommodityService implements ICommodity {

    private String couponService = new String("couponService");

    @Override
    public void sendCommodity(String uid, String commodityid, String bizid, Map<String, String> extMap) {
        // 具体的实现
        System.out.println("result " + couponService);
    }
}
