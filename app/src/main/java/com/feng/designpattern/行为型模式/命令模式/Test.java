package com.feng.designpattern.行为型模式.命令模式;

import com.feng.designpattern.行为型模式.命令模式.cook.impl.GuangDongCook;
import com.feng.designpattern.行为型模式.命令模式.cook.impl.JiangSuCook;
import com.feng.designpattern.行为型模式.命令模式.cuisine.impl.GuangDongCuisine;
import com.feng.designpattern.行为型模式.命令模式.cuisine.impl.JiangSuCuisine;
import com.feng.designpattern.行为型模式.责任链模式.ChainOfResponsibilityClient;
import com.feng.designpattern.行为型模式.责任链模式.Ratify;
import com.feng.designpattern.行为型模式.责任链模式.Request;
import com.feng.designpattern.行为型模式.责任链模式.Result;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class Test {
    public static void main(String[] args) {


        System.out.println("============方法一=============");


        GuangDongCuisine guangDongCuisine = new GuangDongCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDongCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.placeOrder();
    }
}
