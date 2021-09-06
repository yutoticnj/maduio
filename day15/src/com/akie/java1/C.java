package com.akie.java1;


interface A{
    int x = 0;
}

class B{
    int x = 1;
}

class C extends B implements A{
    public void pX(){
//        System.out.println(x);     编译不通过
        System.out.println(super.x);//1
        System.out.println(A.x);//0
    }

    public static void main(String[] args) {
        new C().pX();
    }
}