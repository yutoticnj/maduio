package com.akie.java;

/*
* 自定义的工具类*/
public class ArrayUtil {

    //求数组的最大值
    public int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println();
        return max;
    }


    //求数组的最小值
    public int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("最小值是：" + min);
        System.out.println();
        return min;
    }


    //求数组的总和
    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和值是：" + sum);
        System.out.println();
        return sum;
    }
    //求数组的平均值
    public int getAvg(int[] arr){
        return getSum(arr) / arr.length;
    }


    //以下两个同名方法构成了重载
    //反转数组
    public void reverse(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[arr.length - 1 - i] = arr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            int s = temp[i];
            System.out.print(s + " ");
        }
    }
    public void reverse(String[] arr) {
        String[] temp = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[arr.length - 1 - i] = arr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            String s = temp[i];
            System.out.print(s + " ");
        }
    }


    //复制数组
    public int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }


    //数组排序
    public void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    int temp;
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
                    //错误的:
                    //swap(arr[j] , arr[j + 1]
                    //正确的:
                    swap(arr,j,j +1);
                }
            }
        }
    }

    //错误的：交换数组中指定两个位置元素的值
//    public void swap(int i , int j) {
//        int temp = i;
//        i = j;
//        j = temp;
//    }

    //正确的：交换数组中指定两个位置元素的值
    public void swap(int[]arr,int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //遍历数组
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }


    //查找指定数组
    public int getIndex(int[] arr,int dest){

        for (int i = 0; i < arr.length; i++) {

            if (dest == (arr[i])) {
               return i;
            }
        }

        return -1;//返回一个负数代表没找到
    }
}
