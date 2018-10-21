package com.kodilla.module0.user;

class TestingUser {
    public static void main (String[] args) {

        User user1 = new User("Jan", "Kowalski", Sex.Male);
        User user2 = new User("Anna", "Dymna", Sex.Female);
        System.out.println("First test of enum: " + Sex.Male);
        System.out.println("Second test of enum: " + Sex.Female);
        user1.printUser();
        user2.printUser();
    }
}
