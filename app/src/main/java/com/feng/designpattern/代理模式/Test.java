package com.feng.designpattern.代理模式;

import com.feng.designpattern.代理模式.动态代理.AdminServiceDynamicProxy;
import com.feng.designpattern.代理模式.动态代理.AdminServiceInvocation;
import com.feng.designpattern.代理模式.静态代理.AdminService;
import com.feng.designpattern.代理模式.静态代理.AdminServiceImpl;
import com.feng.designpattern.代理模式.静态代理.AdminServiceProxy;

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

        AdminServiceImpl adminService = new AdminServiceImpl();
        System.out.println("代理的目标对象为：" + adminService.getClass());

        AdminServiceInvocation adminServiceInvocation = new AdminServiceInvocation(adminService);
        AdminService dynamicProxy = (AdminService) new AdminServiceDynamicProxy(adminService, adminServiceInvocation).getPersonProxy();

        System.out.println("代理对象： " + dynamicProxy.getClass());

        dynamicProxy.update();


        System.out.println("============方法二=============");
        AdminServiceImpl target = new AdminServiceImpl();
        AdminServiceInvocation invocation = new AdminServiceInvocation(target);
        AdminService proxy = (AdminService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocation);
        proxy.find();


        System.out.println("============方法三=============");


        final AdminServiceImpl target3 = new AdminServiceImpl();
        AdminService proxy3 = (AdminService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("查看用户是否有权限进行操作xxx");
                method.invoke(target3, args);
                System.out.println("记录用户执行操作的用户信息，更改时间等xxxx");
                return null;
            }
        });
        proxy3.update();
    }
}
