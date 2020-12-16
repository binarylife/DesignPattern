package com.feng.designpattern.创建型.建造者模式.coat;

import com.feng.designpattern.创建型.建造者模式.Matter;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-23
 * 多乐士涂料
 */
public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐士士是阿克苏诺⻉贝尔旗下的著名建筑装饰油漆品牌,产品畅销于全球100个国家,每年年全球有5000万户家庭使用用多乐士士油漆。";
    }
}
