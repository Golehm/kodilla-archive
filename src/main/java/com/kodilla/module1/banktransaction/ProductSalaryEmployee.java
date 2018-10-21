package com.kodilla.module1.banktransaction;

///////////////////////////// my code ////////////////////////////////////////////
class ProductSalaryEmployee implements Employee {

    private int numberOfProducts;
    private double payPerProduct;

    public ProductSalaryEmployee(int numberOfProducts, double payPerProduct ) {
        this.numberOfProducts = numberOfProducts;
        this.payPerProduct = payPerProduct;
    }

    public double calculateSalary() {
        return this.numberOfProducts * payPerProduct;
    }
}

class BonusSalaryEmployee implements Employee {
    private double baseSalary;
    private double bonus;

    public BonusSalaryEmployee(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return this.baseSalary * (this.bonus +1);
    }
}