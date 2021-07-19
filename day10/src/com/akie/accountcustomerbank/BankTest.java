package com.akie.accountcustomerbank;

public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addCustomer("Robert","Louis");
        bank.getCustomer(0).setAccount(new Account(50000));
        bank.getCustomer(0).getAccount().deposit(10000);
        bank.getCustomer(0).getAccount().withdraw(60001);

        System.out.println("该账户为：" + bank.getCustomer(0).getFirstName() + "," +
                bank.getCustomer(0).getLastName());
        System.out.println("账户余额为：" + bank.getCustomer(0).getAccount().getBalance());
        System.out.println("该账户是第" + bank.getNumberOfCustomer() + "位账户");


    }
}
