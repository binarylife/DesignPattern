package com.feng.designpattern.行为型模式.命令模式.cuisine.impl;

import com.feng.designpattern.行为型模式.命令模式.cook.ICook;
import com.feng.designpattern.行为型模式.命令模式.cuisine.ICuisine;

/**
 * Created by fengbei
 * on 20-11-30
 */
public class GuangDongCuisine implements ICuisine {

    private ICook cook;

    public GuangDongCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
