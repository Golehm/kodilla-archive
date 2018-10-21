package com.kodilla.module0.dzielnik7;

public class Divider7 {
    public static void divsev ( int num )
    {
        if(num%7 == 0)
        {
            System.out.println("Liczba 7 jest dzielnikiem liczby "+num);
        }
        else
        {
            System.out.println("Liczba 7 nie jest dzielnikiem liczby "+num);
        }
    }

    public static void main (String[] args) {
        int a = 7;
        int b = 15;
        int c = 21;

        divsev(a);
        divsev(b);
        divsev(c);

    }
}
