package com.akie.java;

import java.util.Arrays;

/*
* 数组中的常见异常
* 1、数组角标越界异常
* 2、空指针的异常*/
public class ArrayExceptionTest {
    public static void main(String[] args) {
        //1、数组角标越界异常 ArrayIndexOutOfBoundsException
        int[] arr = new int[5];
        Arrays.fill(arr,6);
        //System.out.println(arr[-2]);  角标越界

        //2、空指针异常 NullPointerException
        int[] arr1 = new int[]{1, 2, 3};
        arr1 = null;
//        System.out.println(arr1[0]); 空指针异常

        String[] arr3 = new String[]{"aa", "bb", "cc"};
        arr3[0] = null; //空指针
        System.out.println(arr3[0].toString());



    }
}
