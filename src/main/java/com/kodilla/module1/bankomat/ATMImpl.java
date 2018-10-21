package com.kodilla.module1.bankomat;

class ATMImpl implements ATM {

    double accountBalance;

    ATMImpl(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void payment(double amount) {
        this.accountBalance = this.accountBalance + amount;
        System.out.println("Payment " + amount);
    }

    public void withdrawal(double amount) {
        this.accountBalance = this.accountBalance - amount;
        System.out.println("Withdrawal " + amount);
    }
}

