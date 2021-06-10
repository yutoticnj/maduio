/*
1、数组的默认初始化值
>数组元素是整型：0
>数组元素是浮点型：0.0
>数组元素是char型：0   不是'0'
>数组元素是boolean型： false

>数组元素是引用数据类型：null

 2、数组的内存解析
*/

public class ArrayTest1 {
    public static void main(String[] args) {
//        组的默认初始化值
        int[] arr = new int[4];
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("******************");

        short[] arr1 = new short[4];
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("******************");

        double[] arr2 = new double[4];
        for (double i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("******************");

        char[] arr3 = new char[4];
        for (char i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("******************");

        boolean[] arr4 = new boolean[4];
        for (boolean i : arr4) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("******************");

        String[] arr5 = new String[4];
        for (String i : arr5) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("******************");
    }
}
