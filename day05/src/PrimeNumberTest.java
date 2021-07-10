/*
100以内的质数输出
只能被1和他整除的自然数
从2开始到n-1都不能被n整除
最小的质数是2

 */

public class PrimeNumberTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int count = 0;
        boolean isFlag = true;
        for (int i = 2; i < 100000; i++,isFlag = true) {//遍历100以内的自然数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            if (isFlag) {
                count++;//System.out.println(i);
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("程序执行时间：" + (end - start));
    }
}
