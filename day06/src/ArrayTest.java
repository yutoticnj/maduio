/*
>数组名
>数组元素
>角标、下标、索引
>数组是有序的
>数组的长度：元素的个数
数组的特点
    数组属于引用类型的变量
    数组是一块连续的空间
    数组的长度确定后不能更改

一维数组的使用
    一维数组的声明和初始化
    如何调用数组的指定位置的元素
    如何获取数组的长度
    如何遍历数组
    数组元素的默认初始化值
    数组的内存解析
 */


public class ArrayTest {
    public static void main(String[] args) {
        //1.数组的声明和初始化
        //1.1  静态初始化  数组的初始化和数组元素的赋值操作同时进行
        int[] ids;//声明
        ids = new int[]{1001,1002,1003,1004};
        //1.2  动态初始化  数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];

        //数组一旦初始化完成其长度就确定了

        //2.如何调用数组指定位置的元素  通过角标的方式
        //数组的角标从0开始，到长度-1结束
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "John";
        names[4] = "Mike";

        //3.如何获取数组的长度
        //属性：length
        System.out.println(names.length);
        System.out.println(ids.length);
        
        //4.如何遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //5.数组元素的默认初始化值 见 ArrayTest1
    }
}
