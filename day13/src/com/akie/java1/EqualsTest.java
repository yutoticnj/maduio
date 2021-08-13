package com.akie.java1;
/*
* 面试题： == 和equals（）区别
*
* 一、回顾 == 的使用：
* == ： 运算符
* 1、可以使用在基本数据类型变量和引用数据类型变量中
* 2、如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定需要类型相同）
*    如果比较的是引用数据类型变量：比较两个对象的地址值是否相同。两个引用是否指向同一个对象实体
*
* 二、equals()方法的使用：
* 1、是一个方法，而非运算符
* 2、只能适用于引用数据类型
* 3、Object类中equals（）的定义：
*       public boolean equals(Object obj){ return (this == obj)}
*       说明：Object类中定义的equals（）和 == 作用是相同的：比较两个对象的地址值是否相同
*
* 4、像String、Date、File包装类等都重写了Object类中的equals（）方法。重写后比较的不是引用的地址值是否相同
*
* 5、通常情况下，我们自定义类如果使用equals（）的话，也通常是比较两个对象的实体内容是否相同，我们需要重写equals（）
*
* */
public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true

        boolean b = true;
//        System.out.println(i == b);

        char c = 10;
        System.out.println(i == c);//true
        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true

        Customer cust1 = new Customer("Tom",21);
        Customer cust2 = new Customer("Tom",21);
        System.out.println(cust1 == cust2);//false   比较的是地址值

        String str1 = new String("akie");
        String str2 = new String("akie");
        System.out.println(str1 == str2);//false
        System.out.println("***************************************");
        System.out.println(cust1.equals(cust2));//false
        System.out.println(str1.equals(str2));//true
    }
}
