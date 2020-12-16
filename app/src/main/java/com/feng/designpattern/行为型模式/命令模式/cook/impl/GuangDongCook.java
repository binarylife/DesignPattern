package com.feng.designpattern.行为型模式.命令模式.cook.impl;

import com.feng.designpattern.行为型模式.命令模式.cook.ICook;

/**
 * Created by fengbei
 * on 20-11-30
 */
public class GuangDongCook implements ICook {
    @Override
    public void doCooking() {
        System.out.println("广广东厨师,烹饪鲁菜,宫廷最大大菜系,以孔府⻛风味为⻰龙头");
    }
}
