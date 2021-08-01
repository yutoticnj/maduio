package com.akie.java3;
/*
* super关键字的使用
* 1、super理解为：父类的
* 2、super可以用来调用：属性、方法、构造器
*
* 3、super的使用
*   3.1我们可以在子类的方法或者构造器中。通过使用“super.属性”或者“super.方法”的方式，
* 显式调用父类中声明的属性或者方法通常境况下我们会省略。
*   3.2特殊情况：当子类和父类中定义了同类的属性时，要想在子类中调用父类中声明的属性，
* 则必须显式的使用“super.属性”的方式，表示父类中的属性。
*   3.3特殊情况：当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时，
* 则必须显式的使用"super.方法"的方式，表明调用的是父类中被重写的方法。

 *
*
* */
public class SuperTest {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.show();

    }
}
