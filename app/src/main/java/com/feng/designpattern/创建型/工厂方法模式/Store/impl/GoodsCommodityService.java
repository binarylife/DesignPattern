package com.feng.designpattern.创建型.工厂方法模式.Store.impl;

import com.feng.designpattern.创建型.工厂方法模式.Store.ICommodity;

import java.util.Map;

/**
 * Created by fengbei
 * on 20-10-21
 * 食物奖品的发放
 */
public class GoodsCommodityService implements ICommodity {


    private String goodsService = new String("goodsService");

    @Override
    public void sendCommodity(String uid, String commodityid, String bizid, Map<String, String> extMap) {
        // 具体的实现
        System.out.println("result " + goodsService);
    }
}
