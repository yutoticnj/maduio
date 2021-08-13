package com.akie.java1;

import java.util.Date;

/*
* Object类中toString()的使用
*
* 1、当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
*
* 2、Object类中toString()的定义：
*       public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());

* 3、String、Date、File、包装类等都重写了Object类中的toSting()方法。
*   使得在调用对象的toString()时，返回“实体信息”。
*
* 4、自定义类可以重写toString()方法，当调用时返回“实体信息”。
*
*
* */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", 21);
        System.out.println(cust1.toString());

        String str = new String("MM");
        System.out.println(str);//MM

        Date date = new Date(12341241241245L);
        System.out.println(date.toString());
    }
}


