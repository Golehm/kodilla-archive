package com.kodilla.module0.animals;

class  Application {
    public static void main (String[] args) {

        Dog dog = new Dog("Reksio");
        Animal animal = dog;

        System.out.println("This is " + dog.getName());
        System.out.println("This is " + animal.getName());
        dog.Drinking();
        dog.Eating();
        dog.makingSound();
    }
}