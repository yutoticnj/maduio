package com.akie.exer2;
/*
* 写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、
年利率4.5%的Account对象。使用withdraw方法提款30000元，并打印余额。
* 再使用withdraw方法提款2500元，使用deposit 法存款3000元，然后打印余额和月利率。
*
* */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        System.out.println("您的余额为：" + account.getBalance() + "元");
        account.withdraw(2500);
        System.out.println("您的余额为：" + account.getBalance() + "元");
        account.deposit(3000);
        System.out.println("您的余额为：" + account.getBalance() + "元");

        System.out.println("月利率为：" + account.getAnnualInterestRate() * 100 + "%");
    }
}
