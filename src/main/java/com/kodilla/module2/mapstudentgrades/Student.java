package com.kodilla.module2.mapstudentgrades;

public class Student {

    private String name;
    private String surname;

    Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

