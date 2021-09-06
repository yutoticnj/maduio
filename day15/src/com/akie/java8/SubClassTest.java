package com.akie.java8;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();

//        s.method1();      接口中定义的静态方法，只能通过接口来调用。
        CompareA.method1();   //只能通过接口自己来调用

        //通过实现类的对象，可以调用接口中的默认方法
        //如果实现类，调用了重写的方法，调用时，仍然调用的是重写的方法
        s.method2();

        //如果子类（或者实现类）继承的父类和实现的接口中声明了同名同参数的默认方法，那么子类在没有重写此方法的情况下，
        //默认调用的是父类中的同名同参数的方法    --->类优先原则

        //如果实现类实现类实现了多个接口，而这多个接口定义了同名同参数的默认方法，如果实现类没有重写该方法，报错。
        //接口冲突，需要在实现类中重写此方法。
        s.method3();



    }
}

class SubClass extends SuperClass implements CompareA,CompareB {
    @Override
    public void method2() {
        System.out.println("SubClass:上海");
    }

    @Override
    public void method3() {
        System.out.println("SubClass:湖北");
    }

    public void myMethod(){
        method3();//自己定义的重写的方法
        super.method3();//调用父类中申明的方法

        //调用接口中的方法
        CompareA.super.method3();
        CompareB.super.method3();
    }
}
