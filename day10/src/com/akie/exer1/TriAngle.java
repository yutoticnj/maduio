package com.akie.exer1;

/*
* 编写两个类 TriAngle 和 TriAngleTest 其中 TriAngle 类中声明私有的底边长 base 和高 height 同时声明公共方法访问私有变量。
* 此外提供类必要的构造器。另一个类中使用这些公共方法计算三角形的面积
* */
public class TriAngle {

    public double base; //底边长
    public double height; //高
    public double area;

    public TriAngle(){
    }

    public TriAngle(double b,double h){
        base = b;
        height = h;
    }

    public void setBase(double b){
        base = b;
    }

    public double getBase(){
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return 0.5 * base * height;
    }

}
