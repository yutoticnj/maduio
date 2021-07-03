package com.akie.java1;

import com.akie.java.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order test = new Order();
//        test.orderDefault = 1;  出了Order类的包以后就不能调用了
        test.orderPublic = 2;
//        test.orderPrivate 不同类private不能调用

//        test.methodDefault();  出了Order类的包以后就不能调用了
        test.methodPublic();
//        test.methodPrivate();  私有方法也不可以调用
    }
}
