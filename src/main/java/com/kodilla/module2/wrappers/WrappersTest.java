package com.kodilla.module2.wrappers;

public class WrappersTest {
    public static void main (String[] args) {

        int a = 1;
        double b = 2.0;
        char c = 'c';

        Integer wrapa = a;
        Double wrapb = b;
        Character wrapc = c;

        if(a == wrapa) {System.out.println("int and Integer are equal");}
        if(b == wrapb) {System.out.println("double and Double are equal");}
        if(c == wrapc) {System.out.println("char and Character are equal");}
    }
}
