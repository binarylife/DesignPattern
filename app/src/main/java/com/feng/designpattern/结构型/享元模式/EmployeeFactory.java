package com.feng.designpattern.结构型.享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class EmployeeFactory {


    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Employee getManager(String department) {

        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {

            manager = new Manager(department);

            System.out.println("部门：" + department);

            String workContent = department + "部门工作内容......";

            System.out.println("工作内容：" + workContent);

            EMPLOYEE_MAP.put(department, manager);

        }

        return manager;

    }
}
