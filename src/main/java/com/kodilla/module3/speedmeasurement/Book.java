package com.kodilla.module3.speedmeasurement;

public class Book{

    private String author;
    private String title;

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public int hashCode(){
        String str = author + title;
        return str.hashCode();
    }

    public boolean equals(Object o){
        Book e = (Book) o;
        return (author.equals(e.getAuthor())) && (title.equals(e.getTitle()));
    }
}
