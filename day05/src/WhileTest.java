/*
while循环

记住要写迭代条件不然会出现死循环
 */

import java.util.Scanner;
//遍历100以内的偶数
public class WhileTest {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 100) {
            if (i % 2 ==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

/* do-while循环
do{
}while();
do-while至少会执行一次循环体
 */
class DoWhileTest {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        int count = 0;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        } while (num <= 100);
        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);
    }
}


//从键盘输入不确定的整数，并判断读入正负的个数，若输入为0则结束
class ForWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zCount = 0;
        int fCount = 0;
        while (true) {
            System.out.print("请输入：");
            int number = scanner.nextInt();

            if (number > 0) {
                zCount++;
            } else if (number < 0) {
                fCount++;
            } else {
                break;
            }
        }
        System.out.println("输入的正整数个数为：" + zCount);
        System.out.println("输入的负整数个数为：" + fCount);
    }
}