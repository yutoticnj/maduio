package com.akie.accountcustomerbank;

public class Bank {

    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(String f,String l) {
        Customer c1 = new Customer(f,l);
        customers[numberOfCustomer] = c1;
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if (index >=0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }

}
