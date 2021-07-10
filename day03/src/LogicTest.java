/*
运算符之四：逻辑运算符

& && | || !  ^
1、操作都是布尔类的变量
2、开发中优先使用短路
 */



public class LogicTest {
    public static void main(String[] args) {
        //区分 &  &&
        //当左边条件为false后&会执行完整个语句，&&会停止后方语句的执行。
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if (b1 & (num1++ >0)){
            System.out.println("我现在在北京");
        }
        else{
            System.out.println("我在南京");
        }
        System.out.println("num1 = " + num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ >0)){
            System.out.println("我现在在北京");
        }
        else{
            System.out.println("我在南京");
        }
        System.out.println("num2 = " + num2);


        //区分| ||
        boolean b3 = true;
        int num3 = 10;
        if (b3 | (num3++ >0)){
            System.out.println("我现在在北京");
        }
        else{
            System.out.println("我在南京");
        }
        System.out.println("num3 = " + num3);

        boolean b4 = true;
        int num4 = 10;
        if (b4 || (num4++ >0)){
            System.out.println("我现在在北京");
        }
        else{
            System.out.println("我在南京");
        }
        System.out.println("num4 = " + num4);




    }
}
