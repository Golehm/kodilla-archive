package com.kodilla.module3.letterssnake;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class SnakeLetters {
    public static void divideEvenOdd (ArrayDeque<String> adList,
                                      ArrayList<String> evenList, ArrayList<String> oddList){

        for(String str: adList){
            if((str.length()%2) == 0){
                evenList.add(str);
            }
            else{
                oddList.add(str);
            }
        }
    }
    public static void main (String[] args) throws java.lang.Exception{
        ArrayDeque<String> aList = new ArrayDeque<String>();
        Random theGenerator = new Random();

        for(int i = 0; i < 50; i++){
            String tmpString = "a";
            int random = theGenerator.nextInt(50);
            for(int j = 0; j <= random; j++){
                tmpString = tmpString + "a";
            }
            aList.push(tmpString);
        }

        for (String tmp: aList)	{System.out.println(tmp);}

        ArrayList<String> evenList = new ArrayList<String>();
        ArrayList<String> oddList = new ArrayList<String>();

        SnakeLetters.divideEvenOdd ( aList, evenList, oddList);

        System.out.println("Even list:");
        for (String tmp: evenList)	{System.out.println(tmp);}

        System.out.println("Odd list:");
        for (String tmp: oddList)	{System.out.println(tmp);}
    }
}