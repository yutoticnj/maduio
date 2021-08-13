package com.akie.java1;
/*
* java.lang.Object类
* 1、Object 类是所有 Java 类的根父类
* 2、如果在类的声明中未使用 extends 关键字指明其父类 则默认父类为java.lang.Object类
* 3、Object类中的功能（属性、方法）就具有通用性
*属性：无
* 方法：equals()  toString()  getClass()  hashCode()  clone()  wait()  notify() notifyAll()
*
* 4、Object类只声明了空参构造器
*
*面试题：
* final     finally     finalize 的区别？
*
*
* */
public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}

class Order{

}
