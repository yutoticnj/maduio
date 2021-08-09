package com.akie.java;

public class Man extends Person{

    boolean isSmoking;
    int id = 1002;

    public void earnMoney(){
        System.out.println("男人挣钱。");
    }

    @Override
    public void eat() {
        System.out.println("男人要多吃肉。");
    }

    @Override
    public void walk() {
        System.out.println("男人走路大步流星");
    }
}
