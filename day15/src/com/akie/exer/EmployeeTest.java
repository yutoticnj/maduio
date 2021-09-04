package com.akie.exer;
/*
* 请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。
*
* */
public class EmployeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager("库克", 1001, 500000, 20000);

        //多态
        Employee manager1 = new Manager("张三", 1002, 500000, 20000);

        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
