package com.feng.designpattern.建造者模式.coat;

import com.feng.designpattern.建造者模式.Matter;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-23
 * 多乐士涂料
 */
public class LiBangCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "立立邦始终以开发绿色色产品、注重高高科技、高高品质为目目标,以技术力力力量量不不断推进科研和开发,满足足消费者需求。";
    }
}
