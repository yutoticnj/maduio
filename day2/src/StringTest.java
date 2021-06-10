/*
1、String属于引用数据类型
2、声明String类型变量的时候使用""  区别于char''
3、String可以和八种基本数据类型变量做运算,只能是连接运算
 */

public class StringTest {
    public static void main(String[] args) {
    String s1 = "HelloWorld";
        System.out.println(s1);
        //String = ""可以  char = ''不可以
    int number = 1001;
    String numberStr = "学号：";
    String info = numberStr + number;// +:连接运算
        System.out.println(info);


    //练习*********************
    char c = 'a';
    int num = 10;
    String str ="hello";
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c + (num + str));//a10hello
        System.out.println((c + num) + str);//107hello
        System.out.println( str+ num + c);//hello10a


    //练习*************
        System.out.println("*   *");
        System.out.println('*' + "\t" +'*');
        String str1 = "";
        System.out.println(3.5f+str1);
    }
}
