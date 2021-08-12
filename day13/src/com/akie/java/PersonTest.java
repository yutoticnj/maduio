package com.akie.java;
/*
* 面向对象特征之三：多态性
*
* 1、理解多态性：可以理解为一个事物的多种形态
* 2、何为多态性：
*       对象的多态性：父类的引用指向子类的对象
*
* 3、多态的使用：虚拟方法使用
*       有了对象的多态性之后，我们在编译期，只能调用父类中声明的方法，但在运行期，实际执行的是子类重写父类的方法
*       总结：（编译看左边，运行看右边）
*
* 4、多态性的使用前提：1.类的继承关系  2.方法的重写
*
* 5、对象的多态性只适用于方法，不适用于属性（编译和运行都看左边）
* */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();
        System.out.println("************************************");
        //*****************************************************
        //子类对象的多态性：父类的引用指向子类的对象
        Person p2 = new Man();
//        Person p3 = new Woman();

        //多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法————虚拟方法调用
        p2.eat();
        p2.walk();
        p2.sleep();

//        p2.earMoney();

        System.out.println(p2.id);//1001

        System.out.println("**************************************");

        //不能调用子类特有的方法：编译时，p2是Person类型
//        p2.earMoney();
        p2.name = "Tom";
        //有了对象多态性之后，内存中实际上是加载了子类特有的属性和方法，但是由于变量声明为父类类型，
        // 导致编译时只能调用父类中声明的属性和方法，子类特有的属性和方法不能调用。

        //如何调用子类特有的属性和方法？
        //向下转型：使用强制类型转换符
        Man m1 = (Man)p2;
        m1.earnMoney();
        m1.isSmoking = true;
        System.out.println("*********************************");

        //强转是，可能会出现ClassCastException的异常
//        Woman w1 = (Woman)p2;
//        w1.goShopping();

        /*
        * instanceof:关键字的使用
        * a instanceof A:判断对象小a是否是类A的实例。如果是返回true、不是返回false
        *
        *使用情景：为了避免在向下转型时出现异常，在转型之前先进行instanceof的判断
        *
        *
        * */

        if (p2 instanceof Woman) {
            Woman w1 = (Woman)p2;
            w1.goShopping();
            System.out.println("*****Woman*******");
        } else if (p2 instanceof Man) {
            Man m2 = (Man)p2;
            m2.earnMoney();
            m2.isSmoking = true;
            System.out.println("*****Man*******");

            //练习：
            //问题一：编译通过，运行不通过
//            Person p3 = new Woman();
//            Man m3 = (Man)p3;

            //问题二：编译通过，运行也通过
            Object obj = new Woman();
            Person p = (Person)obj;

            //问题三：编译不通过
//            Man m5 = new Woman();
        }
    }
}
