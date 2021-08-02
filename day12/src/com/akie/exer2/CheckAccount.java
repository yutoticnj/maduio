package com.akie.exer2;
/*
* 、创建 Account类的一个子类 CheckAccount 代表可透支的账户，
* 该账户中定义一个属性overdraft代表可透支限额。
* 在 CheckAccount 类中重写 withdraw 方法，其算法如下：
* 如果（取款金额<账户余额），可直接取款
* 如果（取款金额>账户余额），计算需要透支的额度
* 判断可透支额overdraft 是否足够支付本次透支需要，
* 如果可以将账户余额修改为0，冲减可透支金额
* 如果不可以提示用户超过可透支额的限额*/
public class CheckAccount extends Account{

    private double overdraft;//可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < balance) {
            super.withdraw(amount);
        } else {
            if (balance + overdraft >= amount) {
                overdraft -= amount - balance;
                balance = 0;
            } else {
                System.out.println("超过可透支余额!");
            }
        }
    }
}
