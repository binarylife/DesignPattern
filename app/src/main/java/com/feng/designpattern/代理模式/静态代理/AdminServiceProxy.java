package com.feng.designpattern.代理模式.静态代理;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class AdminServiceProxy implements AdminService {

    private final AdminService adminService;

    @Override
    public void update() {
        System.out.println("判断用户是否有权限进行update操作");
        adminService.update();
        System.out.println("记录用户执行update操作的用户信息，更改内容时间等等");
    }

    @Override
    public Object find() {
        System.out.println("查看用户是否有权限进行find操作");
        System.out.println("记录用户执行find操作的用户信息，查看内容和时间等");
        return adminService.find();
    }

    public AdminServiceProxy(AdminService adminService) {
        this.adminService = adminService;
    }
}
