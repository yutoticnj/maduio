package com.akie.java2;

import com.akie.java1.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //在不同包下的普通类（非子类），要使用Order类，不可以调用声明为private、缺省、protected权限的属性、方法
        order.orderPublic = 1;
        order.methodPublic();

    }
}
