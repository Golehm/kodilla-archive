package com.kodilla.module0.animals;

abstract class Animal{

    private String name = "Animal";

    public String getName() {
        return name;
    }

    public void Drinking(){
        System.out.println("Animal drinks.");
    }

    public void Eating(){
        System.out.println("Animal eats.");
    }

    abstract void makingSound();

}
