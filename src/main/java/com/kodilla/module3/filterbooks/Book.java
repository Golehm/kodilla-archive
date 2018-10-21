package com.kodilla.module3.filterbooks;

import java.lang.*;

class Book{

    private String title;
    private String author;
    private int year;

    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public int hashCode(){
        return title.hashCode() + author.hashCode() + year;
    }

    public boolean equals(Object o){
        Book b = (Book) o;
        if (year == b.getYear())
        {
            return (title.equals(b.getTitle())) && (author.equals(b.getAuthor()));
        }
        else
        {
            return false;
        }
    }

    public String toString(){
        return title + ", " + author + ", born: " + year;
    }
}
