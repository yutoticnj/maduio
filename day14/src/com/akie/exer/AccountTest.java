package com.akie.exer;

public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        Account acct2 = new Account("123456",50000);

        Account.setInterestRate(0.025);
        Account.setMinMoney(100);

        System.out.println(acct1);
        System.out.println(acct2);
    }
}
