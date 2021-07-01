package com.akie.part2;
/*
* 实现对三个整数进行排序，输出时按照从小到大的顺序输出。
* */
import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if (x >= y) {
            if (z >= x) {
                System.out.println("min:" + y + " mid:" + x + " max:" + z);
            } else {
                if (y >= z) {
                    System.out.println("min:" + z + " mid:" + y + " max:" + x);
                } else {
                    System.out.println("min:" + y + " mid:" + z + " max:" + x);
                }
            }
        } else {
            if (x >= z) {
                System.out.println("min:" + z + " mid:" + x + " max:" + y);
            } else {
                if (y >= z) {
                    System.out.println("min:" + x + " mid:" + z + " max:" + y);
                } else {
                    System.out.println("min:" + x + " mid:" + y + " max:" + z);
                }
            }
        }
    }
}
