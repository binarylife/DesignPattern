package com.feng.designpattern.建造者模式.floor;

import com.feng.designpattern.建造者模式.Matter;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-23
 * <p>
 * 德尔地板
 */
public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "DER德尔集团是全球领先的专业木木地板制造商,北北京2008年年奥运会家装和公装地板供应商";
    }
}
