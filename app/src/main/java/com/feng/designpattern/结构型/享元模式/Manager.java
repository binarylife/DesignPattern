package com.feng.designpattern.结构型.享元模式;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class Manager implements Employee {


    private String title = "经理";
    private String department;
    private String workContent;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void work() {

    }

    public String getWorkContent() {
        return workContent;
    }
}
