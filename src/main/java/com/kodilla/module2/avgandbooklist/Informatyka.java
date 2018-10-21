package com.kodilla.module2.avgandbooklist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Informatyka {

    public void arrayIntoArrayList ( ArrayList<Byte> arrayList, byte table[])
    {
        for(int i=0 ; i<table.length ; i++) {
            arrayList.add(table[i]);
        }
    }

    public double minAVGmax ( ArrayList<Byte> arrayList)
    {
        //	double avg = 0;
        int max = 1;
        int min = 6;
        int sum = 0;
        for(Byte each : arrayList) {

            if (each > max)	{ max = each; }
            if (each < min)	{ min = each; }

            sum = sum + each;
        }
        return (double)(sum - max - min)/(arrayList.size()-2);
    }

    public static void main (String[] args) {

        byte grades1 [] = {3,3,4,4,3,4,5,4,5,5,6};
        byte grades2 [] = {1,2,2,4,3,3,2,1,4,2,2,3};
        byte grades3 [] = {2,3,5,4,2,2,4,3,1,4,2,3,2,4,3,4,2};
        byte grades4 [] = {4,5,5,5,5,6,5,5,5,5,5,5,6,5,5};
        byte grades5 [] = {4,4,4,4,4,4,4,4,4,4,4,4,4,4};

        ArrayList<Byte> gradesList1 = new ArrayList<Byte>();
        ArrayList<Byte> gradesList2 = new ArrayList<Byte>();
        ArrayList<Byte> gradesList3 = new ArrayList<Byte>();
        ArrayList<Byte> gradesList4 = new ArrayList<Byte>();
        ArrayList<Byte> gradesList5 = new ArrayList<Byte>();

        Informatyka informatyka = new Informatyka();

        informatyka.arrayIntoArrayList(gradesList1, grades1);
        informatyka.arrayIntoArrayList(gradesList2, grades2);
        informatyka.arrayIntoArrayList(gradesList3, grades3);
        informatyka.arrayIntoArrayList(gradesList4, grades4);
        informatyka.arrayIntoArrayList(gradesList5, grades5);

        System.out.println("Average1 to " +informatyka.minAVGmax(gradesList1));
        System.out.println("Average2 to " +informatyka.minAVGmax(gradesList2));
        System.out.println("Average3 to " +informatyka.minAVGmax(gradesList3));
        System.out.println("Average4 to " +informatyka.minAVGmax(gradesList4));
        System.out.println("Average5 to " +informatyka.minAVGmax(gradesList5));

        LinkedList<Books> theList = new LinkedList<Books>();

        Books book1 = new Books("Potop",2002);
        Books book2 = new Books("Pitstop",2001);
        Books book3 = new Books("Parob",2000);
        Books book4 = new Books("Po to p...",1999);
        Books book5 = new Books("P.o.t.o.p.",1998);
        theList.add(0, book1);
        theList.add(1, book2);
        theList.add(2, book3);
        theList.add(3, book4);
        theList.add(4, book5);

        for(Books book: theList){

            if(book.year >= 2000){

                System.out.println(book.title);

            }

        }
    }
}