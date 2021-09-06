package com.akie.example;

interface
Filial {// 孝顺的
    default void help() {
        System.out.println("老妈，我来救你了");
    }
}

interface
Spoony {// 痴情的
    default void help() {
        System.out.println("媳妇，别怕，我来了");
    }
}

class Man implements Filial,Spoony{

    @Override
    public void help() {
        System.out.println("该怎么办？");
        Filial.super.help();
        Spoony.super.help();
    }
}
