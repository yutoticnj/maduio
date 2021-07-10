/*
输入两个数，求最大的公约数和最小公倍数
 */

import java.util.Scanner;
public class ForTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int m = scanner.nextInt();
        System.out.println("请输入第二个正整数");
        int n = scanner.nextInt();

        int min = Math.min(m, n);
        for (int i = min; i >=1 ; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为：" +i);
                break;
            }
        }

        int max = Math.max(m, n);
        for (int i = max; i <= m * n ; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数为：" +i);
                break;
            }
        }

    }
}

//水仙花数  三位数 各个位上的数字的立方和等于其本身
class ForTest1 {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            int bai = i / 100;
            int shi = i % 100 / 10;
            int ge = i % 10;
            if (bai*bai*bai + shi*shi*shi + ge*ge*ge == i) {
                System.out.println("水仙花数为：" + i);
            }

        }
    }
}