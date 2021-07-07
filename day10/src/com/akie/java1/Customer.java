package com.akie.java1;

/*
* JavaBean 是一种 Java 语言写成的可重用组件。
所谓 javaBean ，是指符合如下标准的 Java 类：
1、类是公共的
2、有一个无参的公共的构造器
3、有属性，且有对应的 get 、 set 方法
*/
public class Customer {

    private String name;
    private int id;

    public Customer(){}

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId(){
        return id;
    }
}
