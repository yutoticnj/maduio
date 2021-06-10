/*
运算符之六：三元运算符
（条件表达式）？表达式1 ：表达式2
根据条件表达式  真为1 假为2
 */


public class SanYuanTest {
    public static void main(String[] args) {
    //获取两个数的较大值
        int m = 12;
        int n = 5;
        int max = (m>n)? m : n;
        System.out.println(max);

        //*******************
        m = n = 1;
        String maxStr = (m > n)? "m大" : ((m == n)? "m和n相等" : "n大");
        System.out.println(maxStr);

    //获取三个数的最大值
        int m1 = 1;
        int m2 = 2;
        int m3 = 3;
        int max1 =  (m1 > m2)? m1 : m2;
        int max2 = (max1 > m3)? max1 : m3;
        int max3 = (((m1 > m2)? m1: m2) > m3)? ((m1 > m2)? m1: m2) : m3;
        System.out.println("max2 = " + max2);
        System.out.println("max3 = " + max3);
        
    }
}
