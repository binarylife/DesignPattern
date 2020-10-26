package com.feng.designpattern.建造者模式.floor;

import com.feng.designpattern.建造者模式.Matter;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-23
 * <p>
 * 德尔地板
 */
public class ShengXiangFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象";
    }

    @Override
    public String model() {
        return "B+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "圣象地板是中国地板行行行业著名品牌。圣象地板拥有中国驰名商标、中国名牌、国家免检、中国环境标志认证等多项荣誉。";
    }
}
