/*
对PrimeNumberTest的优化
方式二
 */

public class PrimeNumberTest2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int count = 0;
        label :for (int i = 2; i <= 100000; i++) {//遍历100以内的自然数
            for (int j = 2; j <= Math.sqrt(i); j++) {//优化2： Math.sqrt(i)=35 对质数有效
                if (i % j == 0) {
                    continue label;
                }
            }
            //能执行到此步骤的都是质数
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("程序执行时间：" + (end - start)); //优化1:7044-860
    }
}
