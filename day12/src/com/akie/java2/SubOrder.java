package com.akie.java2;

import com.akie.java1.Order;

public class SubOrder extends Order {
    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法
//        orderInt = 3;
//        orderPrivate = 4;
//
//        methodDefault();
//        methodPrivate();

        methodProtected();
        methodPublic();
    }
}
