package com.akie.java3;

public class Person {

    String name;
    int age;
    int id = 1000;

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
