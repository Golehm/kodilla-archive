package com.kodilla.module1.structuraloo;

class Application
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Starting...");

        UserValidator validator = new UserValidator("Adam", 40.5, 178);
        validator.validate();

        System.out.println("End of the program");
    }
}
