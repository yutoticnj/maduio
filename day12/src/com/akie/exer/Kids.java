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

    //修改 练习 1.2 中 定义的类 Kids ，在 Kids 中重新定义 employed方法，
    // 覆盖父类 ManKind 中定义 的 employed 方法，
    // 输出“ Kids should study and no job.”


    @Override
    public void employed() {
        System.out.println("Kids should study and no job.");
    }
}
