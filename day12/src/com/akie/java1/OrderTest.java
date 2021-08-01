package com.akie.java1;

public class OrderTest{
    public static void main(String[] args) {
        Order order = new Order();

        order.orderInt = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //同一个包中其他类不能调用Order类中私有的属性、方法
//        order.orderPrivate = 4;
//        order.methodPrivate();
    }
}
