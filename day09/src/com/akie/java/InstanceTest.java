package com.akie.java;
/*
* 一、“万事万物介对象”
* 1.在Java语言范畴当中，我们都将功能、结构封装到类中，通过实例化，来调用 具体的功能结构
* 2.涉及到Java语言与前端Html、后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类、对象
*
*二、内存解析的说明
* 1、引用类型的变量，只可能储存两类值， null  或   地址值（含变量的类型）
*
* 三、匿名对象的使用
* 1、理解，创建的对象没有显式的变量名，即为匿名对象
* 2、特征：只能调用一次
* 3、
*
* */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p);
        p.playGame();
        p.sendEmail();

        //匿名对象
        new Phone().sendEmail();
        new Phone().playGame();
        new Phone().price = 1999;
        new Phone().showPrice();//0.0

        //***********************************
        PhoneMail mall = new PhoneMail();
        //匿名对象的使用
        mall.show(new Phone());
    }
}

class PhoneMail{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}

class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public void showPrice(){
        System.out.println("手机的价格为：" + price);
    }
}