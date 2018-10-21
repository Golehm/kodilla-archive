package com.kodilla.module0.samolot;

public class Plane {
    private float speed;
    private boolean doors;
    private String color;// GB colour, US color
    private byte seats;

    public void liftOff(){};
    public void landing(){};
    public void boarding(byte passengers){};

    Plane(String color, byte seats){
        this.color = color;
        this.seats = seats;
        doors = true;// doors closed
        speed = 0.0f;
    }
    public static void main (String[] args) {
        // your code goes here
    }
}
