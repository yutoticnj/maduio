package com.akie.exer;
/*
* 创建程序 在其中定义两个类： Person 和 PersonTest 类 。 定义如下：
用setAge 设置人的合法年龄 0-130  用 getAge 返回人的年龄。
*
* 2、练习2：
*   使所有人的age初始属性为18
* */
public class Person {
    private int age;
    private String name;

    public void setAge(int a) {
        if (a < 0 || a > 130) {
            throw new RuntimeException("传入的数据非法");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public Person(){}


    public Person(int a) {
        age = a;
    }

    public Person(String n,int a) {
        name = n;
        age = a;
    }

}
