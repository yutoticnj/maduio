package com.akie.exer2;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount account = new CheckAccount(1122,20000,0.045,5000);

        account.withdraw(5000);
        System.out.println("您的账户余额为：" + account.getBalance() + "元");
        System.out.println("您的可透支额为：" + account.getOverdraft() + "元");
        System.out.println();
        account.withdraw(18000);
        System.out.println("您的账户余额为：" + account.getBalance() + "元");
        System.out.println("您的可透支额为：" + account.getOverdraft() + "元");
        System.out.println();
        account.withdraw(3000);
        System.out.println("您的账户余额为：" + account.getBalance() + "元");
        System.out.println("您的可透支额为：" + account.getOverdraft() + "元");

    }
}
