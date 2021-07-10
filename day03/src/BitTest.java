/*
<< 左移1位相当于乘以2

>>右移1位相当于除以2  复数以1补头
>>>右移不管正负 以0开头补
*/


public class BitTest {
    public static void main(String[] args) {
        int m = 12;
        int n = 5;
        System.out.println("m & n :" + (m & n));
        System.out.println("m | n :" + (m | n));
        System.out.println("m ^ n :" + (m ^ n));
        /*
        数字间的相互位运算是通过二进制进行与或操作
         */
    }
}

class ExchangeTest{
    public static void main(String[] args) {
        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);

        /*方式一：定义临时变量  推荐的方式
         int temp = num1;
         num1 = num2;
         num2 = temp;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);
        */

        /*方式二：好处：不用定义临时变量  弊端：相加超出本身变量储存范围  有局限性
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);
         */

        //方式三：使用位运算符
        num1 =num1 ^ num2;
        num2 =num1 ^ num2;
        num1 =num1 ^ num2;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);
    }
}
