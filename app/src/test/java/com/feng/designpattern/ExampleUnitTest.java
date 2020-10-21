package com.feng.designpattern;

import com.feng.designpattern.工厂方法模式.Store.ICommodity;
import com.feng.designpattern.工厂方法模式.Store.StoreFactory;

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
}