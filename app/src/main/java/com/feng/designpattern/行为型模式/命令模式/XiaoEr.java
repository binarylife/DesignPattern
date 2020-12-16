package com.feng.designpattern.行为型模式.命令模式;

import com.feng.designpattern.行为型模式.命令模式.cuisine.ICuisine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengbei
 * on 20-11-30
 */
public class XiaoEr {

    private List<ICuisine> cuisines = new ArrayList<>();

    public void order(ICuisine cuisine) {
        cuisines.add(cuisine);
    }

    public synchronized void placeOrder() {
        for (int i = 0; i < cuisines.size(); i++) {
            cuisines.get(i).cook();
        }
        cuisines.clear();
    }
}