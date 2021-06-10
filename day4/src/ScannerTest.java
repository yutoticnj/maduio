/*
如何从键盘获取变量 需要用Scanner类

具体步骤
1、导包： import java.util.Scanner;
2、Scanner实例化
3、调用相关方法获取对应的变量值
 */

import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入");
        int num = scan.nextInt();
        System.out.println(num);
    }
}
 class ScannerTest1 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         System.out.println("请输入你的姓名");
         String name = scan.next();
         System.out.println(name);

         System.out.println("请输入你的年龄");
         int age = scan.nextInt();
         System.out.println(age);

         System.out.println("请输入你的体重");
         double weight = scan.nextDouble();
         System.out.println(weight);

         System.out.println("你是否相中我了（true/false）");
         boolean isLove = scan.nextBoolean();
         System.out.println(isLove);
     }
 }

 class IfTest{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("请输入考试成绩");
         int score = scanner.nextInt();
         if (score == 100){
             System.out.println("奖励一辆宝马");
         }else if (score <= 99 && score > 80){
             System.out.println("奖励一台iPhone");
         }else if (score <= 80 && score > 60){
             System.out.println("奖励一台iPad");
         }else{
             System.out.println("啥都没有");
         }
         
     }
 }

 /*
 由键盘输入num1 num2 num3 三个值 通过if-else对他们进行排序
  */
class IfTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = scanner.nextInt();
        int max,mid,min;
        if (num1 >= num2) {
            if (num3 >= num1) {
                max = num3;
                mid = num1;
                min = num2;
            } else {
                max = num1;
                if (num3 >= num2) {
                    mid = num3;
                    min = num2;
                }else{
                    mid = num2;
                    min = num3;
                }
            }
        } else {
            if (num3 >= num2) {
                max = num3;
                mid = num2;
                min = num1;
            } else {
                max = num2;
                if (num3 >= num1) {
                    mid = num3;
                    min = num1;
                }
                else {
                    mid = num1;
                    min = num3;
                }
            }
        }
        System.out.println("max = "+ max +",mid =" + mid +",min = " + min);
    }
}

//彩票作业
/*
随机产生一个数
若输入的数字一致则获得1等奖
若输入的数字一样位数不一样则2等奖
若输入的数字有一个且位数一样则3等奖
若不一样则没有奖
 */
class IfTest3{
    public static void main(String[] args) {
        double value = Math.random() * 90 + 10; //Math.random() [0.0,1.0)
        int randomValue = (int) value;
        Scanner scanner = new Scanner(System.in);
        System.out.println(randomValue);
        int scannerValue = scanner.nextInt();
        if (scannerValue / 10 == randomValue / 10 && scannerValue % 10 == randomValue % 10) {
            System.out.println("你获得一等奖");
        } else if (scannerValue / 10 == randomValue % 10 && scannerValue % 10 == randomValue / 10) {
            System.out.println("你获得二等奖");
        } else if (scannerValue / 10 == randomValue / 10 || scannerValue % 10 == randomValue % 10) {
            System.out.println("你获得三等奖");
        } else {
            System.out.println("你啥都没有");
        }

    }
}

class IfTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身高：（cm）");
        int height = scanner.nextInt();
        System.out.println("请输入你的财富：（千万）");
        double wealth = scanner.nextDouble();
        System.out.println("请输入你是否帅：（是/否）");
        //boolean appearance = scanner.nextBoolean();
        String appearance = scanner.next();

        if (height >= 180 && wealth >= 1 && appearance.equals("是")) {
            System.out.println("太棒了，嫁给他");
        } else if (height >= 180 || wealth >= 1 || appearance.equals("是")) {
            System.out.println("还可以");
        } else {
            System.out.println("不嫁了");
        }
    }
}



