package com.akie.java;

import java.util.Arrays;

/*
* Arrays:操作数组的工具类    有很多操作数组的方法*/
public class ArraysTest {
    public static void main(String[] args) {

        //boolean equals(int[] a, int[] b)
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = new int[]{4, 7, 6, 5, 8};
        boolean isEquals = Arrays.equals(arr1,arr2); //判断两数组是否相等
        System.out.println(isEquals);

        //String toString(int[] a) 数组的遍历与输出
        System.out.println(Arrays.toString(arr1));

        //void fill(int[] a,int val)
        Arrays.fill(arr1,10);//用于数据组初始化
        System.out.println(Arrays.toString(arr1));

        //void sort(int[] a) 数组的快速排序
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //int binarySearch(int[] a,int key) 二分法查找
        int[] arr = new int[]{15, 65, 45, 24, -24, 97, 56, 567, 286, 35, 76};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 24);
        System.out.println(index);
    }
}
