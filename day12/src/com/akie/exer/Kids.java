package com.akie.exer;
/*
* 定义类 Kids 继承 ManKind ，并包括
成员变量 int yearsOld
方法 printAge 打印 yearsOld 的值。
* */
public class Kids extends ManKind{
    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("I am:" + yearsOld + " years old");
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
