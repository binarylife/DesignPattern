package com.feng.designpattern.结构型.代理模式.静态代理;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class AdminServiceImpl implements AdminService {
    @Override
    public void update() {
        System.out.println("修改管理系统数据");
    }

    @Override
    public Object find() {
        System.out.println("查看管理系统数据");

        return new Object();
    }
}
