package com.akie.java1;

public class ValueTransferTest2 {
    public static void main(String[] args) {

        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m + ",n = " + data.n);

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(data);
        System.out.println("m = " + data.m + ",n = " + data.n);

    }

    public void swap(Data i) {
        int temp =i.m;
        i.m = i.n;
        i.n = temp;
    }
}

class Data{
    int m,n;

}