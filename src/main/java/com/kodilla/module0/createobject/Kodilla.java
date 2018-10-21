package com.kodilla.module0.createobject;

class Kodilla {
    private String kodilla;
    Kodilla(String kodilla){
        this.kodilla = kodilla;
    }
    public String getKodilla(){
        return kodilla;
    }
    public static void main (String[] args) {
        Kodilla kodilla = new Kodilla("Kodilla");
        System.out.println(kodilla.getKodilla());
    }
}
