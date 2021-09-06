package com.akie.exer1;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.6);

        int compareValue = c1.compareTo(c2);
        if (compareValue > 0) {
            System.out.println("c1半径大");
        } else if (compareValue < 0) {
            System.out.println("c2半径大");
        } else {
            System.out.println("二者半径一样大");
        }

        int compareValue1 = c1.compareTo(new java.lang.String("AA"));
        System.out.println(compareValue1);
    }
}
