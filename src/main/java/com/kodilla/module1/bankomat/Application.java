package com.kodilla.module1.bankomat;

class Application {
    public static void main(String[] args) throws java.lang.Exception {
        ATMImpl test = new ATMImpl(1000.0);
        test.payment(500.0);
        test.withdrawal(1500.0);
        test.connectionWithBank(true);
        ATM.end();
    }
}
