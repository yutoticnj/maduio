/*
分支结构之二 switch-case

switch 表达式只能是如下6种数据类型之一：
byte short char int 枚举类型（JDK） String类型
case 中间不能有范围
 */

import java.util.Scanner;
public class SwitchTest {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            default :
                System.out.println("other");
        }
    }
}


//低于60分的输出不合格   高于60分的输出合格

class SwitchTest1 {
    public static void main(String[] args) {
        System.out.println("请输入考试分数");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        switch (score / 10) {
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("不合格");
                break; //多个case语句相同则可以合并
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
                System.out.println("合格");
                break;

                /*题目更优方法
                switch(score / 60){
                case 0:  合格
                case 1:  不合格
                }
                 */
        }

    }
}


//从键盘输入2019年的 month day  输出是2019的第几天
class SwitchTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入2019年的月份：");
        int month = scanner.nextInt();
        System.out.println("请输入2019年的日期：");
        int day = scanner.nextInt();
        int sumDays = 0;

/*  比较的冗余 多次重复
        switch (month) {
            case 1:
                sumDays = day;
            case 2:
                sumDays = day + 31;
            case 3:
                sumDays = day + 28 + 31;
        }

 */

        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;

                System.out.println("2019年" + month + "月" + day + "日，是当年的第" + sumDays + "天");


        }
    }
}

//从键盘输入年的 month day  输出是的第几天
class SwitchTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year  = scanner.nextInt();
        System.out.println("请输入年的月份：");
        int month = scanner.nextInt();
        System.out.println("请输入年的日期：");
        int day = scanner.nextInt();
        int sumDays = 0;

            switch (month) {
                case 12:
                    sumDays += 30;
                case 11:
                    sumDays += 31;
                case 10:
                    sumDays += 30;
                case 9:
                    sumDays += 31;
                case 8:
                    sumDays += 31;
                case 7:
                    sumDays += 30;
                case 6:
                    sumDays += 31;
                case 5:
                    sumDays += 30;
                case 4:
                    sumDays += 31;
                case 3:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        sumDays += 29;
                    } else {
                        sumDays += 28;
                    }
                case 2:
                    sumDays += 31;
                case 1:
                    sumDays += day;
                    System.out.println(year + "年" + month + "月" + day + "日，是当年的第" + sumDays + "天");
        }

    }
}






