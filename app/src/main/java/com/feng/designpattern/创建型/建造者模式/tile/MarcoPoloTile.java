package com.feng.designpattern.创建型.建造者模式.tile;

import com.feng.designpattern.创建型.建造者模式.Matter;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-23
 * <p>
 */
public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
    }

    @Override
    public String model() {
        return "缺省";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "⻢马可波罗”品牌诞生生于1996年年,作为国内最早品牌化的建陶品牌,以“文文化陶瓷”占领市场,享有“仿古砖至至尊”的美誉。";
    }
}
