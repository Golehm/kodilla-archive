package com.kodilla.module1.usinghashcode;

class Application
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Kiler predator = new Kiler("Predator");
        Kiler terminator = new Kiler("Terminator");

        int result1 = predator.hashCode();
        int result2 = terminator.hashCode();
        String name1 = predator.showName();
        String name2 = terminator.showName();
        System.out.println("HashCode dla "+name1+" to "+result1);
        System.out.println("HashCode dla "+name2+" to "+result2);
    }
}
