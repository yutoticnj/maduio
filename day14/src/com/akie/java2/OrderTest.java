package com.akie.java2;
/*对属性可以赋值的位置：
 * 1、默认初始化
 * 2、显示初始化
 * 3、构造器中初始化
 * 4、有了对象之后可以 直接“对象.属性”,进行赋值
 * 5、在代码块中进行赋值
 *
 * 执行的先后顺序
 * 1 - 2(5) - 3 - 4
 * */

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order{

    {
        orderId = 4;
    }
    int orderId = 3;
}


