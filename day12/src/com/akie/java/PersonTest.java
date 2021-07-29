package com.akie.java;
/*
* 方法的重写
*
* 1、重写：子类继承父类后，可以对父类中同名同参数的方法，进行覆盖操作
*
* 2、应用：重写后，当创建子类对象之后，通过子类对象调用的子父类中的同名方法，实际执行的是重写父类的方法
* */
public class PersonTest {
    public static void main(String[] args) {

        Student s1 = new Student("物流");
        s1.eat();
        s1.sleep(8);

        s1.study();
    }
}
