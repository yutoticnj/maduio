/*从键盘读入5个学生的成绩，找出最高分，并输出学生成绩等级
最高分-10 A
最高分-20 B
最高分-30 C
最高分-40 D
*/


import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");

        int number = scanner.nextInt();
        int[] score = new int[number];

        int maxScore = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.print("请输入第" + (i+1) +"个学生成绩：");
            score[i] = scanner.nextInt();
            if (maxScore <= score[i]) {
                maxScore = score[i];
            }
        }

        /* 对最优成绩比较进行优化
        int maxScore = score[0];
        for (int i = 0; i < score.length; i++) {
            if (maxScore <= score[i]) {
                maxScore = score[i];
            }
        }
        */

        System.out.println("最好成绩为：" + maxScore);

        char level = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= maxScore - 10) {
                level = 'A';
            } else if (score[i] >= maxScore - 20) {
                level = 'B';
            }else if (score[i] >= maxScore - 30) {
                level = 'C';
            }else if (score[i] >=0) {
                level = 'D';
            }
            System.out.println("该生的成绩为" + level + "等级");
        }

    }
}
