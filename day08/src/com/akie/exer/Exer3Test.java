package com.akie.exer;

/*
* 3.1编写程序，声明一个method方法，在方法中打印一个10*8的*型矩形，在main方法中调用该方法。
* 3.2修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
* 3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的*型矩形，并计算该矩形的面积，将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
*/
public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();
//        3.1 test
//        test.method();

//        3.2test
//        System.out.println(test.method());

//        3.3test
        System.out.println(test.method(8,8));
    }

/*  3.1
    public void method(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */

/*    public int method(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10*8;
    }*/

    public int method(int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m*n;
    }
}
