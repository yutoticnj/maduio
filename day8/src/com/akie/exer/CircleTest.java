package com.akie.exer;
//设计类Circle计算圆的面积
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 5;

        System.out.println(c1.findArea());

    }
}

class Circle{
    //属性
    double radius;

    //方法
    public double findArea(){
        return Math.PI * radius * radius;
    }

}
