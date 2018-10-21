package com.kodilla.module2.average;

import java.lang.*;

class TableAverage
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] table = {2,3,5,7,11,13,17,19,23,29,31,37, 41, 43, 47, 53, 59, 61, 67, 71};

        int sum = 0;

        for(int i=0; i<20; i++){
            System.out.println("Array element names[" + i + "] = " + table[i]);
            sum = sum + table[i];
        };

        double average = (double)sum/20.0;
        System.out.println("Average is "+average);
    }
}
