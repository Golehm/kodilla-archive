package com.kodilla.module4;

public class Calculator {

    public void calculate (int a, int b, char choice) {

        int c;

        switch (choice) {
            case '+':
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;
            case '-':
                c = a - b;
                System.out.println(a + " - " + b + " = " + c);
                break;
            case '*':
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
                break;
            case '/':
                c = a / b;
                System.out.println(a + " / " + b + " = " + c);
                break;
            case '%':
                c = a % b;
                System.out.println(a + " % " + b + " = " + c);
                break;
            default:
                System.out.println("Invalid choice or user :-)");
        }
    }

    public void calculate (int a, int b, String choiceString) {

        int c;

        switch (choiceString) {
            case "+":
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;
            case "-":
                c = a - b;
                System.out.println(a + " - " + b + " = " + c);
                break;
            case "*":
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
                break;
            case "/":
                c = a / b;
                System.out.println(a + " / " + b + " = " + c);
                break;
            case "%":
                c = a % b;
                System.out.println(a + " % " + b + " = " + c);
                break;
            default:
                System.out.println("Invalid choice or user :-)");
        }
    }
}

