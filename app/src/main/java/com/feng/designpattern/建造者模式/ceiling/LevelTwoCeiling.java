package com.feng.designpattern.建造者模式.ceiling;

import com.feng.designpattern.建造者模式.Matter;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-23
 * 二级级吊顶
 */
public class LevelTwoCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶,二二级吊顶高高度一一般就往下吊20cm,要是层高高很高高,也可增加每级的厚度";
    }
}
