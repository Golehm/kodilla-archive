package com.kodilla.module1.braveknight;

class Application {

    public static void main(String args[]) {

        Quest deadquest = new DeadIslandQuest();
        Quest elitequest = new EliteKnightQuest();

        Knight diq = new Knight(deadquest);

        Knight ekq = new Knight(elitequest);

        diq.callQuest(deadquest);
        ekq.callQuest(deadquest);
        diq.callQuest(elitequest);
        ekq.callQuest(elitequest);
        System.out.println("The End");

    }

}
