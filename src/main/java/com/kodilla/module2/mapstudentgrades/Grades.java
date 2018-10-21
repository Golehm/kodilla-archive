package com.kodilla.module2.mapstudentgrades;

import java.util.List;

public class Grades {

    List<Double> grades;

    Grades(List<Double> grades) { //dostwać gotowy obiekt i przypisywać do pola.
        this.grades = grades;
    }
    public double calculateAverage() {
        double sum = 0;

        for (Double entry: grades) {//Funkcja nie musi przyjmować listy
            //ocen ponieważ już ją ma - w polu klasy.
            sum = sum + entry;
        }
        return sum / grades.size();
    }
}
