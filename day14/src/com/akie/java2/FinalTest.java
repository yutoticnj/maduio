package com.akie.java2;
/*
* final:最终的
*
* 1、final可以用来修饰的结构：类、方法、变量
*
* 2、final 用来修饰一个类:此类不能被其他类继承。
*       比如：String类、System类、StringBuffer类
*
* 3、final 用来修饰一个方法：此方法不可以被重写
*           比如：Object类中的getClass()方法
*
*4、final 用来修饰变量：此时的“变量”就称为是一个常量
*       4.1 final修饰属性：可以考虑赋值的位置有：显示初始化、代码块中初始化、构造器中初始化
*       4.2 final修饰局部变量：
*           尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋值一个实参。
*           一旦赋值以后，就只能在此方法体内使用此形参，但不能重新赋值。
*
* static  final: 用来修饰属性：全局常量
* */
public class FinalTest {

    //显示初始化
    final int width = 10;

    //代码块进行赋值
    final int Left;
    {
        Left = 1;
    }

    //空参构造器赋值
    final int Right;
    public FinalTest(){
        Right = 0;
    }

    public FinalTest(int n){
        Right = n;
    }

//    final int Down;
//    public void setDown(int down){
//        this.Down = down;
//    }     不能通过方法进行final赋值



    public void doWidth(){
//        width = 20;    final属性的width不能被修改
    }

    public void show(){
        final int num = 10; //常量
//        num += 20;  不能对final进行操作
    }

    public void show(final int num){
//        num = 20;  形参传入后，只能调用不能修改
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 10;

        num = num + 5;

        FinalTest test = new FinalTest();
        test.show(10);
    }

}

//不能被继承
final class FinalA{

}

//class B extends FinalA{}

//class C extends String{}

class AA{
    public final void show(){

    }
}

class BB extends AA{
//    public void show(){}    AA中为final方法，所以不能继承
}