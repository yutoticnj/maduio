package com.akie.part2;

import java.util.Scanner;

/*
* 编写程序，判断给定的某个年份是否是闰年
闰年的判断规则如下：
      （1）若某个年份能被4整除但不能被100整除，则是闰年。
      （2）若某个年份能被400整除，则也是闰年。

提示：
if((year % 4 ==0 && year % 100 != 0) || year % 400 == 0){}
*/
public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}

//要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b。
class Exer31{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入a:");
        int a = scanner.nextInt();
        System.out.println("请输入b:");
        int b = scanner.nextInt();
        if (a % b == 0 || a + b > 1000) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

//输出从1到100之间所有不能被3整除的数;并输出这些整数的和
class Exer32 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 != 0 ) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("总和为：" + sum );
    }

}
