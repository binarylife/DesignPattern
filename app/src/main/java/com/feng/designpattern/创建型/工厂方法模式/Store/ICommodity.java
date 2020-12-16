package com.feng.designpattern.创建型.工厂方法模式.Store;

import java.util.Map;

/**
 * Created by fengbei
 * on 20-10-21
 * 定义奖品发放的接口
 */
public interface ICommodity {
    /**
     * 奖品发放接口
     *
     * @param uid
     * @param commodityid
     * @param bizid
     * @param extMap
     * 接口的入参包括；用户ID、奖品ID、业务ID以及扩展字段用于处理发放实物商品时的收获地址。
     */
    void sendCommodity(String uid, String commodityid, String bizid, Map<String, String> extMap);
}
