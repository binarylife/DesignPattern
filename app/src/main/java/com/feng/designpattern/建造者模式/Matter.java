package com.feng.designpattern.建造者模式;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-23
 * 物料接口
 * 物料料接口口提供了了基本的信息,以保证所有的装修材料料都可以按照统一一标准进行行行获取
 */
public interface Matter {
    // 场景 ，地板、地砖、涂料、吊顶
    String scene();

    //  品牌
    String brand();

    //  型号
    String model();


    //  价格
    BigDecimal price();


    //  描述
    String desc();
}
