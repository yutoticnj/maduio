package com.akie.java;

/*
* 类中方法的声明和使用
*
* 方法：描述类应该具有的功能
* 比如： Math类      sqrt()  random()
*       Scanner类   nextXxxx()
*       Arrays类    sort（） binarySearch() toString()
*
* 1、举例
* public void eat(){}                           有返回值  没有返回值     有形参   没有形参
* public void sleep(int hour){}
* public String getName(){}
* public String getNation(String nation){}
*
* 2、方法的声明：权限修饰符  返回值类型  方法名（形参列表）{方法体}
*
* 3、说明
*       3.1权限修饰符：默认为public
*           Java规定的4种权限修饰符：private、public、缺省、protected     封装性的时候细说
*
*       3.2返回值类型：  有返回值 vs 没有返回值
*           3.2.1如果有返回值，则必须在声明时指定返回值的类型。  方法中需要使用return关键字来指定类型的变量或常量
*                如果没有返回值，则声明的时候，使用void来表示。
*           3.2.2定义的方法该不该有返回值
*       3.3.方法名：属于标识符，遵循名字定义规范
*       3.4形参列表：方法可以声明0个，一个或者多个
*           格式：数据类型1 形参1，数据类型2 形参2， 。。。。。。
*
*
* return关键字的使用：
 * */
public class CustomerTest {
    public static void main(String[] args) {

    }
}

class Customer {
    String name;
    int age;
    boolean isMale;

    public void eat() {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国际是： " + nation;
        return info;
    }
}