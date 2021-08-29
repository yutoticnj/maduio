package com.akie.java2;
/*
* 类的成员之四：代码块(或初始化块)
* 1、代码块的作用：用来初始化类、对象
* 2、代码块如果有修饰的话，只能用static
* 3、分类：静态代码块  VS  非静态代码块
*
* 4、静态代码块
*       >内部可以有输出语句
*       >随着类的加载而执行(只执行一次)
*       >作用：初始化类的属性
*       >如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
*       >静态代码块的执行优先于非静态代码块的执行
*       >静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构
*
* 5、非静态代码块
*       >内部可以有输出语句
*       >随着对象的创建而执行
*       >每创建一个对象，就执行一次非静态代码块
*       >作用：可以在创建对象的时候对对象的属性进行初始化
*       >如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
*       >非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
*
*
* 对属性可以赋值的位置：
* 1、默认初始化
* 2、显示初始化
* 3、构造器中初始化
* 4、有了对象之后可以 直接“对象.属性”,进行赋值
* 5、在代码块中进行赋值
* */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);

        Person person = new Person();
        Person person1 = new Person();
        System.out.println(person.age);
    }
}

class Person{
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //static的代码块
    static{
        System.out.println("hello,static block - 1");
        desc = "我是一个爱学习的人！";
        info();
    }

    static {
        System.out.println("hello,static block - 2");
    }
    //非static的代码块
    {
        System.out.println("hello,block - 1");
        age = 1;
        info();
        eat();
    }

    {
        System.out.println("hello,block - 2");
    }



    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info(){
        System.out.println("我是一个快乐的人！");
    }
}
