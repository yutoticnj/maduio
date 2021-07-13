package com.akie.java2;

/*
* this 关键字的使用
* 1、this可以修饰：属性、方法、构造器
*
* 2、this修饰属性和方法：
*    this理解为：当前对象 或当前正在创建的对象
*
*   2.1在类的方法中，我们可以使用“this.属性”或“this.方法”的方式，调用当前对象的属性或者方法
*   2.2在类的构造器中，我们可以使用“this.属性”或“this.方法”的方式，调用当前对象的属性或者方法
*
* 3、this用来修饰、调用构造器
*   1、在类的构造器中，可以显式的使用“this（形参列表）”方式，调用本类中指定的其他的构造器
*   2、构造器中不能通过“this（形参列表）”方式调用自己
*   3、如果一个类中有n个构造器，则最多有n-1个构造器中使用了“this（形参列表）”
*   4、必须声明在构造器的首行
*
*
* */
public class PersonTest {
    public static void main(String[] args) {
        Person  p1 = new Person();
        p1.setName("Tom");
        System.out.println(p1.getName());

        p1.eat();
        System.out.println();
        Person p2 = new Person("Jerry",20);

    }

}

class Person{
    private String name;
    private int age;

    public Person(){
        //this.eat();
        String info = "Person 初始化是，需要考虑一下的1、2、3、4（共四十行代码）";
        System.out.println(info);
        //Person 初始化是，需要考虑一下的1、2、3、4（共四十行代码）
    }

    public Person(String name){
        this(); //调用空参构造器
        this.name = name;

    }

    public Person(int age){
        this();
        this.age = age;
    }

    public Person(String name,int age){
        this(age);//先调用Person(age)构造器
        this.name = name;
        //this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("吃饭");
        study();
    }

    public void study(){
        System.out.println("学习");
    }

}