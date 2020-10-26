package com.feng.designpattern;

import com.feng.designpattern.原型模式.QuestionBank;
import com.feng.designpattern.原型模式.QuestionBankController;
import com.feng.designpattern.工厂方法模式.Store.ICommodity;
import com.feng.designpattern.工厂方法模式.Store.StoreFactory;
import com.feng.designpattern.建造者模式.Builder;
import com.feng.designpattern.建造者模式.IMenu;
import com.feng.designpattern.抽象工厂模式.CacheService;
import com.feng.designpattern.抽象工厂模式.factory.JDKProxy;
import com.feng.designpattern.抽象工厂模式.factory.impl.EGMCacheAdapter;
import com.feng.designpattern.抽象工厂模式.impl.CacheServiceImpl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void test_commodity() {
        StoreFactory storeFactory = new StoreFactory();
        ICommodity commodityService = storeFactory.getCommodityService(1);
        commodityService.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);
    }


    @Test
    public void test_cacheAdapter() {
        try {
            CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new
                    EGMCacheAdapter());
            proxy_EGM.set("test", "test01");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test_cacheBuilder() {
        Builder builder = new Builder();
        DecorationPackageMenu iMenu = (DecorationPackageMenu) builder.levelOne(100.02);
        System.out.print(iMenu.getDetail());
        System.out.print(builder.levelTwo(80.00).getDetail());
    }


    @Test
    public void test_QuestionBank() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createpaper("小明", "123"));
        System.out.println(questionBankController.createpaper("小红", "456"));
        System.out.println(questionBankController.createpaper("小花", "789"));
    }
}