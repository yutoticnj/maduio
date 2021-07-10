/*
对PrimeNumberTest的优化

 */

public class PrimeNumberTest1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int count = 0;
        boolean isFlag = true;
        for (int i = 2; i <= 100000; i++,isFlag = true) {//遍历100以内的自然数
            for (int j = 2; j <= Math.sqrt(i); j++) {//优化2： Math.sqrt(i)=35 对质数有效
                if (i % j == 0) {
                    isFlag = false;
                    break;//优化一：只对非质数有效
                }
            }
            if (isFlag) {
                //System.out.println(i);
                count++;
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("程序执行时间：" + (end - start)); //优化1:7044-860
    }
}
