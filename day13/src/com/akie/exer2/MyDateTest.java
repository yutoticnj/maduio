package com.akie.exer2;

public class MyDateTest {
    public static void main(String[] args){
    MyDate m1 = new MyDate(14, 3, 1976);
    MyDate m2 = new MyDate(14, 3, 1976);
    if(m1 == m2){
            System.out.println ("m1==m2");
    }else{
        System.out.println ("m1!= m2");// m1 != m2}
        }
        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2 ");// m1 is equal to m2
        } else {
            System.out.println ("m1 is not equal to m2");;
        }
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof MyDate) {
            MyDate myDate= (MyDate)o;
            return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
        }
        return false;
    }
}


