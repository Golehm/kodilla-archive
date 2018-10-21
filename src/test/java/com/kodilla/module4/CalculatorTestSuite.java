package com.kodilla.module4;

import java.util.Scanner;

public class CalculatorTestSuite {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        char choice;
        String choiceString;

        System.out.print("Enter first number:");
        a = reader.nextInt();

        System.out.print("Enter second number:");
        b = reader.nextInt();

        System.out.println("+ adding - subtracting * multiplying / dividing % modulo");
        System.out.println("Enter your choice");

        choice = reader.next().charAt(0);

        Calculator calculator = new Calculator();

        calculator.calculate(a, b, choice);

        System.out.println("In java 7 switch works with strings");
        System.out.println("+ adding - subtracting * multiplying / dividing % modulo");
        System.out.println("Enter your choice");

        choiceString = reader.next();

        calculator.calculate(a, b, choiceString);
    }
}

