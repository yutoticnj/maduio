/*
1、基本数据类型
整数类型（int short byte long）浮点类型（float double）字符型（char）布尔型（boolean）
2、引用数据类型
类（class）接口（interface）数组（array[]）
 */
public class VariableTest {
    public static void main(String[]args){
        int myAge = 22;
        System.out.println(myAge);
    }
}

//八种基本数据类型
class VariableTest1 {
    public static void main(String[]args){
        //byte 范围-128 -  127
        byte b1=-128;
        byte b2= 127;
        System.out.println(b1);
        System.out.println(b2);

        //long变量需要以l或者L结尾
        int i1=12345;
        long l1= 12345678901234L;
        System.out.println(i1);
        System.out.println(l1);

        double d1=123.3;
        System.out.println(d1);
        //float变量需要以f或者F结尾
        float f1=12.3f;
        System.out.println(f1);
        //平时使用double类型

        //定义char变量，使用''
        char c1;
        char c2 = '中';
        c1 = 'A';//不能写多个字符  c1 = 'AB'
        System.out.println(c1);
        System.out.println(c2);
        //可以用来转义字符
        char c3= '\n';//换行符
        System.out.print("你好"+c3);
        System.out.println("世界");
        //使用Unicode值来表示变量
        char c4 = '\u0123';
        System.out.println(c4);

        //布尔类型只能  true false
        boolean bb1 = true;
        System.out.println(bb1);
        System.out.println("hello\"你好\"bye");
        // \可以转义字符  \\n \" 输出为 \n "

        }
}

//七种基本数据类型运算
/*
1、自动类型提升：


2、强制类型转换：


 */
class VariableTest2{
    public static void main(String[] args) {
    byte b1 = 2;
    int i1 = 129;
    int ii1 = b1+i1;
    float f1 = b1+i1;
        System.out.println(ii1);
        System.out.println(f1);


        char c1 = 'a';
        int i2 = 1;
        int i3 = c1+i2;
        System.out.println(i3);
        //short+char 用int类型
        //byte char short 三者做运算的话 运算结果为int类型

    }
}

//强制类型转换，自动提升的逆运算
/*
1、需要使用强制转换符
2、可能导致精度损失
 */
class VariableTest3{
    public static void main(String[] args) {

    double d1 =12.3;
    int i1 =(int)d1;
    System.out.println(i1);

    double d2 =12.9;
    int i2 =(int)d2;
    System.out.println(i2);//截断不是四舍五入


    int i3 =128;
    byte b1 = (byte)i3;
        System.out.println(b1);//b1=-128
    }
}

//float long的表示
class VariableTest4{
    public static void main(String[] args) {
    //1、编码情况1
    long l1 = 123;
    //long l2 = 123456788912; 过大
    long l2 = 123456788912L;

    //float 必须添加f不然默认识别为double

    /*
    2、编码情况2
    整型常量默认为int
    浮点型常量默认为double
    */
    }
}