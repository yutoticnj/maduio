package com.akie.java;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 65, 45, 24, -24, 97, 56, 567, 286, 35, 76};

        //冒泡排序

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
