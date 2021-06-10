package com.akie.java;

/*
* 定义一个int型的一维数组，包含10个元素，分别付一些随机整数
* 然后后求出所有元素的最大值、最小值、和值、平均值、并输出
* 所有随机数是两位数*/
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //最大值
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println();


        //最小值
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("最小值是：" + min);
        System.out.println();

        //和值
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和值是：" + sum);
        System.out.println();

        //平均值
        double avg = sum/10;
        System.out.println("平均值是：" + avg);
        System.out.println();
    }
}
