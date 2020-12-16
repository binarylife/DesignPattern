package com.feng.designpattern.创建型.抽象工厂模式;

import com.feng.designpattern.创建型.抽象工厂模式.fruitfactory.ChinaFactroty;
import com.feng.designpattern.创建型.抽象工厂模式.fruitfactory.USAFactroty;
import com.feng.designpattern.结构型.代理模式.动态代理.AdminServiceDynamicProxy;
import com.feng.designpattern.结构型.代理模式.动态代理.AdminServiceInvocation;
import com.feng.designpattern.结构型.代理模式.静态代理.AdminService;
import com.feng.designpattern.结构型.代理模式.静态代理.AdminServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class Test {
    public static void main(String[] args) {
//        AdminServiceImpl adminService = new AdminServiceImpl();
//        AdminServiceProxy adminServiceProxy = new AdminServiceProxy(adminService);
//        adminServiceProxy.update();
//        adminServiceProxy.find();


        System.out.println("============方法一=============");

        //  创建中国工厂
        ChinaFactroty chinaFactroty = new ChinaFactroty();
        //  通过中国工厂
        Fruit apple = chinaFactroty.getApple();
        apple.get();

        //  创建美国工厂
        USAFactroty usaFactroty= new USAFactroty();
        //  通过中国工厂
        Fruit usaapple = usaFactroty.getApple();
        usaapple.get();

        Fruit banana = usaFactroty.getBanana();
        banana.get();
    }
}
