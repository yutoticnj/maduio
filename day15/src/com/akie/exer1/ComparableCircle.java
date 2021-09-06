package com.akie.exer1;
/*
* 定义一个ComparableCircle类继承Circle类并且实现CompareObject接口。
* 在ComparableCircle类中给出接口中方法compareTo的实现体,用来比较两个圆的半径大小 。
* */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
//          错误的
//            return (int) (this.getRadius() - c.getRadius());   精度损失
//          正确的
//            if (this.getRadius() > c.getRadius()) {
//                return 1;
//            } else if (this.getRadius() < c.getRadius()) {
//                return -1;
//            } else {
//                return 0;
//            }

            return this.getRadius().compareTo(c.getRadius());
        } else {
            throw new RuntimeException("传入的数据类型不匹配");
        }
    }
}


