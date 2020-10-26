package com.feng.designpattern.建造者模式.tile;

import com.feng.designpattern.建造者模式.Matter;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-23
 * <p>
 * 德尔地板
 */
public class DongPengTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "东鹏";
    }

    @Override
    public String model() {
        return "1001";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    @Override
    public String desc() {
        return "东鹏瓷砖以品质铸就品牌,科技推动品牌,口口碑碑传播品牌为宗旨,2014年年品牌价值132.35亿元,位列列建陶行行行业榜首首。";
    }
}
