package com.akie.java;

public class ArrayUtilTest {
    public static void main(String[] args) {
//        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32, 34, 32, 5, 3, 54, 654, -98, 0, -53, 5};
        int max = ArrayUtil.getMax(arr);
        System.out.println("排序前：");
        ArrayUtil.print(arr);

        ArrayUtil.sort(arr);
        System.out.println("排序后：");
        ArrayUtil.print(arr);

        System.out.println("查找：");
        int index = ArrayUtil.getIndex(arr,5);
        if (index > 0) {
            System.out.println("找到了，位置是：" + index);
        }else {
            System.out.println("没找到");
        }

        String[] arr1 = new String[]{"我","爱","你","一","生","一","世"};
        ArrayUtil.reverse(arr1);

    }
}
