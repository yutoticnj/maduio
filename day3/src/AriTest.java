/*
运算符之一：算术运算符
+ - * / ++ --
 */
public class AriTest {
    public static void main(String[] args) {
    // 除号：/
    int num1 = 12;
    int num2 = 5;
    int result1 = num1 / num2;
        System.out.println(result1);//2
    int result2 = num1 / num2 * num2;
        System.out.println(result2);//10
    double result3 = num1 / num2;
        System.out.println(result3);//2.0
    double result4 = num1 / (num2 * 1.0);
        System.out.println(result4);//2.4
    double result5 = (double)num1 / num2;
        System.out.println(result5);//2.4


    //%: 取余运算
        System.out.println("num1 % num2 =" +   num1 % num2);
    //结果的符号与被模数一致

    //前++  不会改变数据类型
    //后++
    int a1 = 10;
    int b1 = ++a1;
        System.out.println("a1=" + a1 + ",b1=" + b1);
    int a2 = 10;
    int b2 = a2++;
        System.out.println("a2=" + a2 + ",b2=" + b2);

    byte bb1 = 127;
    bb1++;
        System.out.println(bb1);

    }
}


 class AriExer{
    public static void main(String[] args) {
        int num = 187;
        int baiwei = num / 100;
        int shiwei = num % 100 / 10;
        int gewei = num % 10;
        System.out.println("百位为："+ baiwei);
        System.out.println("十位为："+ shiwei);
        System.out.println("个位为："+ gewei);

    }
}
