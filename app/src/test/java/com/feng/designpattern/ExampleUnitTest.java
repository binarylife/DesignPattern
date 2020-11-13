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
import com.feng.designpattern.桥接模式.channel.WxPay;
import com.feng.designpattern.桥接模式.mode.PayFaceMode;
import com.feng.designpattern.桥接模式.mode.PayFingerprintMode;
import com.feng.designpattern.装饰模式.ChineseStyle;
import com.feng.designpattern.装饰模式.RedDecorator;
import com.feng.designpattern.适配器模式.AC;
import com.feng.designpattern.适配器模式.AC110;
import com.feng.designpattern.适配器模式.AC220;
import com.feng.designpattern.适配器模式.adapter.ChinaPowerAdapter;
import com.feng.designpattern.适配器模式.adapter.IDC5Adapter;
import com.feng.designpattern.适配器模式.adapter.JapanPowerAdapter;

import org.junit.Test;

import java.math.BigDecimal;

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


    @Test
    public void test_ACAdapter() {
        AC220 ac220 = new AC220();
        AC110 ac110 = new AC110();
        IDC5Adapter chinaPowerAdapter = new ChinaPowerAdapter();
        IDC5Adapter japanPowerAdapter = new JapanPowerAdapter();


        if (chinaPowerAdapter.support(ac110)) {
            System.out.print(chinaPowerAdapter.outputDC5V(ac110));
        }
    }


    @Test
    public void test_apy() {


        WxPay wxPay = new WxPay(new PayFingerprintMode());
        wxPay.transfer("123", "456", new BigDecimal(9));
    }


    @Test
    public void test_Decorator() {
        ChineseStyle chineseStyle = new ChineseStyle();
//        chineseStyle.sytle();

        RedDecorator redDecorator = new RedDecorator(chineseStyle);
        redDecorator.sytle();
    }

}