package com.akie.exer2;

import java.util.Objects;

/*
* 编写 Order 类，有 int 型的 orderId,String型的orderName,
* 相应的getter() 和 setter() 方法，两个参数的构造器，
* 重写父类的equals()方法：public boolean equals(Object obj)
* 并判断测试类中创建的两个对象是否相等。
* */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"AA");
        Order order2 = new Order(1001,"BB");
        Order order3 = new Order(1001,"BB");

        System.out.println(order1.equals(order2));
        System.out.println(order2.equals(order3));
    }
}

class Order {
private int orderId;
private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

}