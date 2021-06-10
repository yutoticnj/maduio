/*
运算符之二：赋值运算符
= += -= *= /= %=

 */


public class SetValueTest {
    public static void main(String[] args) {
    //赋值符号
    int i1 = 10;
    int j1 = 10;

    //连续赋值
    int i2,j2;
    i2 = j2 =10;

    int i3 = 10, j3 = 10;

    //************************
    int num = 10;
    num += 2;
        System.out.println(num);//12

    int num1 = 12;
    num1 %= 5;
        System.out.println(num1);//2

    short s1 = 10;
    s1 += 2;
        System.out.println(s1);//12 +=不改变数据类型

    int n1 = 10;
    n1 += (n1++) + (++n1);// n = n + (n++) + (++n)
                          //     10 + 10 +   12
                          //     n=10   n=11   n=12
        System.out.println(n1);
    }
}


