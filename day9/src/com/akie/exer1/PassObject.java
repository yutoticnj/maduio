package com.akie.exer1;
/*
* 定义一个类 PassObject,在类中定义一个方法 printAreas()
* 该方法的定义如下 public void printAreas(Circle c, int time)
* 在printAreas 方法中打印输出 1 到 time 之间的每个整数半径值 以及对应的面积。
 * 例如 time为5则输出半径 1 2 3 4 5 以及对应的圆面积
*
* 在 main 方法中调用 printAreas() 方法调用完毕后输出当前半径值
* */
public class PassObject {

    public static void main(String[] args) {
        PassObject test = new PassObject();

        Circle c = new Circle();

        test.printAreas(c,5);
    }

    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");

        //设置圆的半径
        for (int i = 1; i <= time ; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
    }
}
