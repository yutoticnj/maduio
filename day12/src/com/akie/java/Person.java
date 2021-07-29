package com.akie.java;

public class Person {

    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age){
         this.name = name;
         this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(int hours){
        System.out.println("睡了" + hours + "个小时");
    }

}
