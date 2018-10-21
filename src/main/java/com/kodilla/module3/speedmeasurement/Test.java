package com.kodilla.module3.speedmeasurement;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test{
    public static void main (String[] args) throws java.lang.Exception{
        LinkedList<Book> list = new LinkedList<Book>();
        for(int n = 0; n < 3000000; n++) {
            Book book = new Book("Author","Title");
            list.add(book);
        }

        long begin = System.nanoTime();
        list.remove(0);
        long end = System.nanoTime();
        System.out.println("Removing first element has taken: " + (end - begin) + " ns");

        begin = System.nanoTime();
        list.remove(list.size()-1);
        end = System.nanoTime();
        System.out.println("Removing last element has taken: " + (end - begin) + " ns");

        Book book1 = new Book("S Lem", "Commander Pirx");
        begin = System.nanoTime();
        list.addFirst(book1);
        end = System.nanoTime();
        System.out.println("Adding first element has taken: " + (end - begin) + " ns");

        Book book2 = new Book("P K Dick", "Valis");
        begin = System.nanoTime();
        list.addLast(book2);
        end = System.nanoTime();
        System.out.println("Adding element at the end has taken: " + (end - begin) + " ns");

        HashMap<Integer, Book> bookList = new HashMap<Integer, Book>();

        for(int n = 0; n < 4000000; n++) {
            Book book = new Book("Author","Title");
            bookList.put(n,book);
        }

        begin = System.nanoTime();
        for(Map.Entry<Integer, Book> entry :bookList.entrySet()){
            if(entry.getKey()==2000000){
                break;
            }
        }
        end = System.nanoTime();
        System.out.println("Searching trough 2000000 entries " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookList.put(1000000, book1);
        end = System.nanoTime();
        System.out.println("Putting 1000000 entry " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookList.remove(3000000);
        end = System.nanoTime();
        System.out.println("Removing 3000000 entry " + (end - begin) + " ns");
    }
}