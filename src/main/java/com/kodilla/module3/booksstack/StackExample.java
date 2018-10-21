package com.kodilla.module3.booksstack;

import java.util.ArrayDeque;

public class StackExample
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);
        Book theBook4 = new Book("GRU", "Wiktor Suworow", 1984);
        Book theBook5 = new Book("36 Forteli", "Piotr Plebaniak", 2017);

        ArrayDeque<Book> theStack = new ArrayDeque<Book>();

        System.out.println("Stack is created. It's size: " + theStack.size());

        theStack.offer(theBook1);
        theStack.offer(theBook2);
        theStack.offer(theBook3);
        theStack.offer(theBook4);
        theStack.offer(theBook5);

        // Check size of the queue
        System.out.println("Stack is filled. It's size: " + theStack.size());
        System.out.println();

        while(theStack.size() > 1){
            theStack.pop();
        }

        Book lastBook = theStack.pop();

        System.out.println("Stack is empty. It's size: " + theStack.size());
        System.out.println();

        System.out.println("Last book taken from stack was:\n" + lastBook);
        System.out.println();

    }
}
