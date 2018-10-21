package com.kodilla.module3.sumsrace;

import java.util.Random;

public class SumRacing {
    public static void main (String[] args) {

        Random randomGenerator = new Random();
        int sumaA = 1000;
        int sumaB = 0;
        int i = 0;

        while (sumaA > sumaB){
            sumaA = sumaA + randomGenerator.nextInt(10);
            sumaB = sumaB + randomGenerator.nextInt(50);
            ++i;

            System.out.println("Loop iteration: " + i);
            System.out.println("sumaA = " + sumaA +" " +"sumaB = " + sumaB);
        }
        System.out.println("Koniec");
    }
}
