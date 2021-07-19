package com.akie.accountcustomer;

public class Test {
    public static void main(String[] args) {

        Customer c1 = new Customer("Jane","Smith");
        Account a1 = new Account(1000,2000,0.0123);
        c1.setAccount(a1);
        c1.getAccount().deposit(100);
        c1.getAccount().withdraw(960);
        c1.getAccount().withdraw(2000);

        System.out.print("Customer [" + c1.getLastName() + "," + c1.getFirstName() + "]");
        System.out.print("has a account: id is " + c1.getAccount().getId() + " ,");
        System.out.print("annualInterestRate is " + c1.getAccount().getAnnualInterestRate() + " ,");
        System.out.print("balance is " + c1.getAccount().getBalance());
        System.out.println();
    }
}
