package com.kodilla.module0.substrfloats;

public class SubstractFloatingPoint {
    public double Substract(double subtrahend, double minuend){

        double difference = subtrahend - minuend;
        return difference;

    }
    public static void main (String[] args) {

        SubstractFloatingPoint sf = new SubstractFloatingPoint();
        System.out.println("Test :" + sf.Substract(2.3, 1.7));
    }
}
