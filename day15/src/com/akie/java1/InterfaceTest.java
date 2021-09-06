package com.akie.java1;
/*
* 接口的使用
* 1、接口使用interface来定义
* 2、Java语言中，接口和类是并列的两个结构
* 3、如何定义接口，定义接口中的成员
*       3.1 JDK7及以前：只能够定义全局常量和抽象方法
*               全局常量：public static final的    书写时可以省略不写
*               抽象方法：public abstract
*
*       3.2 JDK8：除了定义全局常量和抽象方法，还可以定义静态方法、默认方法
*
* 4、接口中不能定义构造器，意味着接口不可以实例化
*
* 5、Java开发中，接口通过类趋势线的方式来使用
*   如果实现类覆盖了接口中所有的抽象方法，则次实现类就可以实例化
*   如果实现类没有覆盖接口中所有的抽象方法，则次实现类仍为一个抽象类
*
* 6、Java类可以实现多个接口--->弥补了java单继承性的局限性
*       格式： class AA extends BB implements CC,DD,EE{}
*
* 7、接口与接口之间可以继承，而且可以多继承
*
* *****************************************************************
*
* 8、接口的具体使用可以体现多态性
* 9、接口，实际上可以看做一种规范
*
* */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable{

    //全局常量
    public static final int MAX_SPEED = 7900; //第一宇宙速度
    int MIN_SPEED = 1;//可以省略 public static final

    //抽象方法
    public abstract void fly();

    void stop();//省略public abstract
}

interface Attackable{
    void attack();
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable{
    @Override
    public void fly() {
        System.out.println("天上风筝在天上飞");
    }
}

class Bullet extends Object implements Flyable,Attackable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

//***********************************

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{

}