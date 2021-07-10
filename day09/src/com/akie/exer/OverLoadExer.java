package com.akie.exer;
/*
* 2.编写程序，定义三个重载方法并调用。方法名为 mOL.
*  三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。
*  分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
*  在主类的 main () 方法中分别用参数区别调用三个方法。
   *
* 3.定义三个重载方法max()，
*   第一个方法求两个int值中的最大值，
*   第二个方法求两个 double 值中的最大值
*   第三个方法求三个 double 值中的最大值，
*   并分别调用三个方法。
*
*
*
* */
public class OverLoadExer {
    public static void main(String[] args) {
        OverLoadExer test = new OverLoadExer();
        test.mOL(5);
        test.mOL(5,2);
        test.mOL("我");
        System.out.println("*******************");

        System.out.println(test.max(2, 4));
        System.out.println(test.max(3.2, 7.6, 5.4));
    }




    public void mOL(int i) {
        System.out.println(i * i);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String i) {
        System.out.println(i);
    }

    //第一个方法求两个int值中的最大值，
    //*   第二个方法求两个 double 值中的最大值
    //*   第三个方法求三个 double 值中的最大值，
    public int max(int i, int j) {
        return Math.max(i, j);
    }

    public double max(double i, double j) {
        return Math.max(i, j);
    }

    public double max(double x, double y, double z) {
        double max = Math.max(x , y);
        return Math.max(max , z);
    }
}
