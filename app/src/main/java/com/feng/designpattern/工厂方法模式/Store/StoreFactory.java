package com.feng.designpattern.工厂方法模式.Store;

import com.feng.designpattern.工厂方法模式.Store.impl.CardsCommodityService;
import com.feng.designpattern.工厂方法模式.Store.impl.CouponCommodityService;
import com.feng.designpattern.工厂方法模式.Store.impl.GoodsCommodityService;

/**
 * Created by fengbei
 * on 20-10-21
 */
public class StoreFactory {

    public ICommodity getCommodityService(int type) {
        switch (type) {
            case 1:
                return new CouponCommodityService();
            case 21:
                return new GoodsCommodityService();
            case 3:
                return new CardsCommodityService();
            default:
                throw new RuntimeException("不存在的商品服务类型");
        }
    }
}
