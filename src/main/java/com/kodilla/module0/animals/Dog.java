package com.kodilla.module0.animals;

class Dog extends Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    void makingSound() {
        System.out.println("hau, hau");
    }
}
