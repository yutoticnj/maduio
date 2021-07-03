package com.akie.exer;

/*
* 在 PersonTest 类 中实例化 Person 类的对象 b 调用 setAge 和getAge 方法 体会 Java 的封装性 。*/
public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(18);
        System.out.println("年龄为： " + b.getAge());
    }
}
