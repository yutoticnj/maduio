package com.akie.java3;

public class Student extends Person {
    String major;
    int id = 2000;

    public Student(){}

    public Student(String major){
        this.major = major;
    }

    public Student(String name,int age,String major){
        super(name, age);
        this.major = major;

    }

    public void study(){
        System.out.println("学习，专业是：" + major);
    }

    @Override
    //对父类中的eat方法进行了重写
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show(){
        System.out.println("name: " + this.name + "  age: " + super.age);
        System.out.println("idP = " + super.id + "  idS = " + this.id);
    }


}


