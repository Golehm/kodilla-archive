package com.kodilla.module1.bankomat;

interface ATM {

    void payment(double amount);
    void withdrawal(double amount);
    default void connectionWithBank(boolean isActive) {

        if (isActive) {
            System.out.println("There is connection with Bank");
        }

    }
    static void end() {

        System.out.println("ATM says goodbye");

    }
}
