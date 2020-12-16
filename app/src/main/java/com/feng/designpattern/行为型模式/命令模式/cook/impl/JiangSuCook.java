package com.feng.designpattern.行为型模式.命令模式.cook.impl;

import com.feng.designpattern.行为型模式.命令模式.cook.ICook;

/**
 * Created by fengbei
 * on 20-11-30
 */
public class JiangSuCook implements ICook {
    @Override
    public void doCooking() {
        System.out.println("江苏厨师,烹饪苏菜,宫廷第二二大大菜系,古今国宴上最受人人欢迎的菜系");
    }
}
