package com.akie.java;

public class OrderTest {
    public static void main(String[] args) {

        Order test = new Order();
        test.orderDefault = 1;
        test.orderPublic = 2;
//        test.orderPrivate 不同类private不能调用

        test.methodDefault();
        test.methodPublic();
//        test.methodPrivate();  私有方法也不可以调用
    }
}
