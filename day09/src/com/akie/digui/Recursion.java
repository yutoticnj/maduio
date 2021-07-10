package com.akie.digui;
/*
* 递归方法的使用（了解）
* 1、递归方法：一个方法体内调用他自身
* 2、方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
*   递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
* */
public class Recursion {
    public static void main(String[] args) {

        //例一:计算1-100之间的所有自然数的和
        //方式一：for循环
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();
        Recursion test = new Recursion();
        System.out.println(test.getSum(100 ));

        System.out.println(test.getSum1(10));

        System.out.println(test.f(10));

        System.out.println(test.Fibonacci(10));



        //方式二：
    }

    //例一：计算1-100之间的所有自然数的和
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n -1);
        }
    }

    //例二：计算1-100之间的所有自然数的乘积
    public int getSum1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n -1);
        }
    }

    //例三：已知 有一个数列： f(0) = 1,f(1) = 4,   f(n+2)=2*f(n+1) + f(n),
    // 其中 n 是大于 0的整数，求 f(10) 的 值。
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return f(n -1) * 2 + f(n -2);
        }
    }

    //斐波拉契数列：输入一个数据 n ，计算斐波那契数列的第 n 个值
    //1 1 2 3 5 8 13 21 34 55
    //规律：一个数等于前两个数之和
    //要求：计算斐波那契数列 的第 n 个值 ，并将整个数列打印出来
    public int Fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n -2);
        }
    }
}
