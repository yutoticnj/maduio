package com.akie.exer1;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(2.0);
        t1.setHeight(2.4);
        System.out.println("base: " + t1.getBase() + ",height: " + t1.getHeight());
        System.out.println("面积为：" + t1.getArea());

        TriAngle t2 = new TriAngle(5.1,5.6);
        System.out.println("base: " + t2.getBase() + ",height: " + t2.getHeight());
        System.out.println("面积为：" + t2.getArea());
    }
}
