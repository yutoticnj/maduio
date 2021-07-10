/*
* 二维数组的使用
* */

public class ArrayTest2 {
    public static void main(String[] args) {

        //二维数组的声明和初始化
        int[] arr = new int[]{1, 2, 3};//一维数组
        int[][] arr1 = new int[][]{{4, 5, 6},{1, 2, 3}};//二维数组的静态初始化

        //动态初始化
        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];
        //错误写法
        //String[][] arr5 = new String[][3];

        int arr4[][] = new int[][]{{1,2,3},{4,5},{6,7,8}};
        int[] arr5 = {1, 2, 3};

        //如何调用指定位置的元素
        System.out.println(arr1[0][1]);
        System.out.println(arr2[1][1]);
        //System.out.println(arr3[1][1]); 空指针报错,需要先对数组进行定义
        arr3[1] = new String[4];
        System.out.println(arr3[1][1]);
        System.out.println();

        //获取数组长度
        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3
        System.out.println(arr4[1].length);//2
        System.out.println(arr4[2].length);//3
        System.out.println();

        //如何遍历二维数组
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        /*
        * 二维数组分为外层元素，内层元素
        * 外层元素 arr[0]  arr[1]
        * 内层元素 arr[0][1]
        * */
        //数组元素的默认初始化
        /*
        * 方式一：int[][] arr6 = new int[4][3];
        * 外层为地址值   内层为  与一维数组相同
        *
        * 方式二：double[][] arr9 = new double[3][];
        * 外层为 null  内层为  报错 空指针异常
        * */

        int[][] arr6 = new int[4][3];
        System.out.println(arr6[0]);// 地址值 [I@1b6d3586  [一维数组 I int型
        System.out.println(arr6[0][0]);//0

        double[][] arr7 = new double[3][3];
        System.out.println(arr7[0]);// 地址值 [D@4554617c  [一维数组 D double型
        System.out.println(arr7[0][0]);

        String[][] arr8 = new String[4][3];
        System.out.println(arr8[0]);// 地址值 [Ljava.lang.String;@74a14482
        System.out.println(arr8[0][0]);

        double[][] arr9 = new double[3][];
        System.out.println(arr9[1]);// null 还未赋值



    }
}
