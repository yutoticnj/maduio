package com.akie.java;
/*
* 面向对象的特征二：继承性
*
* 一、继承性的好处
*   1、提高代码复用性
*   2、便于功能的扩展
*   3、为之后的多态性提供了前提
*
* 二、继承性的格式  class A extends B{}
*   A:子类、派生类、subclass
*   B：父类、超类、基类、superclass
*
*   体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有结构：属性、方法
*       特别的：父类VS声明的私有的属性和方法，继承后仍然认为获取了父类VS的私有的结构
*       只有因为封装性的影响，使得子类不能直接调用父类的结构
*
*   子类继承父类以后还可以声明自己特有的属性或方法：实现功能的扩展
*
* 三、Java中对继承的规定
*   1、一个类可以被多个子类继承
*   2、一个类只有一个父类：单继承
*   3、子父类是相对的概念
*   4、子类直接继承的类称为：直接父类   间接继承的称作：间接父类
*   5、子类继承父类之后，就获取了直接父类和间接父类中声明的属性和方法
*
* 四、   1、如果我们没有显式的声明一个类的父类的话，则此继承与java.lang.Object类
*       2、所有的java类都直接或间接的继承于java.lang.Object类
*       3、意味着没所有java类具有java.lang.Object类声明的功能。
*
* */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(18);
        p1.eat();

        Student s1 = new Student();
        s1.name = "Tom";
        s1.sleep();
        s1.study();
        s1.breath();//间接继承方法

        Creature c = new Creature();


    }

}
