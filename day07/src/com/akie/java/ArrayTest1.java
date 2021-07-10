package com.akie.java;

import java.util.Scanner;
//算法的考察：数组的复制、翻转、查找（线性查找、二分法查找）
public class ArrayTest1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"AA", "BB", "CC", "DD"};

        for (String s : arr) {
            System.out.print(s);
        }
        System.out.println();


        //数组的复制 不同于 arr1 = arr
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        //数组的反转
        /*String[] temp = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[arr.length - 1 - i ] = arr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            String s = temp[i];
            System.out.print(s + " ");
        }*/

        //查找
        //线性查找
        String dest = "BB";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {

            if (dest.equals(arr[i])) {
                System.out.println("找到了指定的元素位置为：" + i);
                isFlag = false;
                break;
            }
        }

        if (isFlag) {
            System.out.println("很遗憾没有找到!");
        }

        //二分法查找:前提所要查找的数组必须有序
        int[] arr2 = new int[]{16, 21, 34, 56, 67, 70, 71};
        int dest1 = 16;
        int head = 0;
        int end = arr2.length - 1;
        boolean isFlag1 = true;
        while (head <= end) {

            int middle = (head + end) / 2;
            if (dest1 == arr2[middle]) {
                System.out.println("找到了指定的元素位置为：" + middle);
                isFlag1 = false;
                break;
            } else if (arr2[middle] > dest1) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }

        if (isFlag1) {
            System.out.println("很遗憾没有找到");
        }
    }
}
