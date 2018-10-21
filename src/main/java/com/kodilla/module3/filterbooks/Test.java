package com.kodilla.module3.filterbooks;

import java.util.HashSet;

public class Test{
    public static void main (String[] args) {

        Book book1 = new Book("Silence of the lambs","Thomas Harris",1984);
        Book book2 = new Book("Monte Christo","Alex Dumas",1837);
        Book book3 = new Book("Potop","Henryk Sienkiewicz",1865);
        Book book4 = new Book("Chlopi","Wladyslaw Reymont",1912);
        Book book5 = new Book("Krotki kurs WKPB","Jozef Stalin",1926);
        Book book6 = new Book("Silence of the lambs","Thomas Harris",1984);

        HashSet<Book> bookSet = new HashSet<Book>();

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);

        for(Book book: bookSet){
            if(book.getYear() < 2010){
                System.out.println(book);
                System.out.println("test equals " + book.equals(book1));
            };
        }
    }
}
