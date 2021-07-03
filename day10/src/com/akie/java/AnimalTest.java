package com.akie.java;

/*
* 面向对象的特征一：封装与隐藏
* 一、问题的额引入
*       当我们创建一个类的对象之后，我们可以通过“对象。属性”的方式，对对象的属性进行赋值。
*       这里，赋值操作要受到属性的数据类型和储存范围的制约。但是除此之外，没有其他的制约条件。
*       但是在实际问题当中，我们要给属性赋值加入额外的条件，这个条件不能在属性声明时体现，只能通过方法的进行限制条件的添加。
*       同时，需要避免用户在使用“对象。属性”的方式对属性进行赋值。则需要将属性声明为private。
*       此时针对于属性就体现了封装性。
*
* 二、封装性的体现：
*       我们将类的属性私有化（private），同时，提供公共的public方法来获取（getXxx）和设置（setXxx）
*
*   拓展：封装性的体现： 1、如上  2、不对外暴露的私有方法  3、单例模式。。。。
*
* 三、封装性的体现，需要权限修饰符来配合
* 1、Java规定的4中权限（从小到大）：private 、 缺省 、 protected 、 public
* 2、4种权限可以用来修饰类的内部结构：属性、方法、构造器、内部类
* 3、具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
*       修饰类：只能用：缺省、public
*
* 总结封装：Java提供了4中权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用的可见性的大小
*
*
*
* */
public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "大黄";
//        a.age = 1;
//        a.legs = 4;  成员变量权限为private  不能直接调用
        a.show() ;

        a.setLegs(-6);
        a.show();
    }
}


class Animal{
    String name;
    private int age;
    private int legs;//腿的个数

    //对属性的设置
    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
            //可以抛出异常
        }
    }
    //对属性的获取
    public int getLegs() {
        return legs;
    }

    //提供关于属性age的get和set方法
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println("name:" + name + " ,age:" + age + " ,legs:" + legs);
    }
}