package com.kodilla.module1.usingabstract;

class ATM extends Bank{

    private void insertCard() {
        System.out.println("Insert card");
    }

    private void givePin(){
        System.out.println("Enter PIN");
    }

    private void enterAmount(){
        System.out.println("How much do you need ?");
    }

    private void cashWithdrawal(){
        System.out.println("Here is you cash.");
    }

    private void thankYou(){
        System.out.println("Thank you for your cooperation.");
    }

    protected void requestAccepted() {
        System.out.println("Your request has been accepted");
    }

    protected void checkingAccount() {
        System.out.println("Checking your account");
    }

    protected void withdrawalOption() {
        System.out.println("Withdrawal option.");
    }

    public void run() {
        this.insertCard();
        this.givePin();
        this.enterAmount();
        this.requestAccepted();
        this.checkingAccount();
        this.withdrawalOption();
        this.cashWithdrawal();
        this.thankYou();
    }

}
