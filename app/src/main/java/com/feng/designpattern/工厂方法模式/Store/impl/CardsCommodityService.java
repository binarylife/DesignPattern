package com.feng.designpattern.工厂方法模式.Store.impl;

import com.feng.designpattern.工厂方法模式.Store.ICommodity;

import java.util.Map;

/**
 * Created by fengbei
 * on 20-10-21
 * 第三方兑换卡奖品的发放
 */
public class CardsCommodityService implements ICommodity {


    private String cardsService = new String("cardsService");

    @Override
    public void sendCommodity(String uid, String commodityid, String bizid, Map<String, String> extMap) {
        // 具体的实现
        System.out.println("result " + cardsService);
    }
}
