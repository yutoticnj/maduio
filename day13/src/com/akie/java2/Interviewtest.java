package com.akie.java2;

import org.testng.annotations.Test;

public class Interviewtest {

    @Test
    public void test1(){
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);//1.0
    }

    @Test
    public void test2(){
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);//1
    }

    @Test
    public void method1(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false    toString 比较地址值

       /* Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
        保存了从-128-127范围的整数。如果使用自动装箱功能，给Integer赋值的范围在
        -128-127范围内时，可以直接使用数组中的元素，不用再new。
        目的：提高效率
        */

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true     自动装箱

        Integer x = 128;  //相当于new了一个Integer对象
        Integer y = 128;  //相当于new了一个Integer对象
        System.out.println(x == y);//false
    }
}
