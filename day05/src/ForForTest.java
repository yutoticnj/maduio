/*
嵌套循环的使用
外层循环控制行数，内层循环控制列数
 */

public class ForForTest {
    public static void main(String[] args) {
        //输出 ****
        for (int i = 0; i <4 ; i++) {
            System.out.print("*");
        }
        System.out.println();System.out.println();
        /*输出
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();System.out.println();
        /*输出    i     j
         *       1     1
         **      2     2
         ***     3     3
         ****    4     4
         */
        for (int i = 0; i < 5; i++) {//控制行数
            for (int j = 0; j <= i; j++) {//控制列数
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();System.out.println();
        /*输出    i    j
         ****    1    4
         ***     2    3
         **      3    2
         *       4    1
         */
        for (int i = 0; i < 5; i++) {//控制行数
            for (int j = 0; j < 5 - i; j++) {//控制列数
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();System.out.println();

    }
}

class ForForTest1 {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 0; i < 5; i++) {//控制行数
            for (int j = 0; j <= 4 - i; j++) {//控制列数
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4 - i; k++) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}


