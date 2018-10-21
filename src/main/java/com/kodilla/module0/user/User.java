package com.kodilla.module0.user;

class User{
    private String name;
    private String surname;
    private Sex sex;

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Sex getSex(){
        return sex;
    }

    public void printUser(){
        System.out.println("User is: " + getName() + " " + getSurname() + " " + getSex());
    }

    User(String name, String surname, Sex sex){

        this.name = name;
        this.surname = surname;
        this.sex = sex;

    }

}
