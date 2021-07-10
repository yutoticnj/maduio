package com.akie.exer;

//打印杨辉三角
// yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
public class YangHuiTest {
    public static void main(String[] args) {
        //声明初始化
        int[][] yangHui = new int[10][];
        //给数组赋值
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;

                for (int j = 1; j < yangHui[i].length - 1; j++) {
                    yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
                }
        }


        //遍历数组
        for (int[] ints : yangHui) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
