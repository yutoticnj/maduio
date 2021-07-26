package com.akie.exer;
/*
* 定义类 KidsTest ，在类的main方法中实例化 Kids的对象someKid ，
* 用该对象访问其父类的成员变量及方法。
* */
public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids(12);

        kid.printAge();

        kid.setSalary(0);
        kid.setSex(1);

        kid.employed();
        kid.manOrWoman();
    }
}
