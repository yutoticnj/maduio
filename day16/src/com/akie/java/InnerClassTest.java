package com.akie.java;

public class InnerClassTest {


    /*
    * 在局部内部类的方法中（比如：show）如果调用局部内部类 所在外部类 所申明的方法中（比如method方法）的局部变量的话
    *要求此局部变量声明为final的
    *
    * jdk7之前的版本，要求次此局部变量显式的声明为final的
    * jdk8之后，可以省略final的声明
    * */
    public void method(){
        //局部变量
        int num = 10;
        class AA{
            public  void show(){
//                num = 20;    //num 需要是final才能够重新定义
                System.out.println(num);
            }
        }
    }
}
