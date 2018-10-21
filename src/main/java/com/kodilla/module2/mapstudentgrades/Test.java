package com.kodilla.module2.mapstudentgrades;

import java.util.*;

public class Test {
    public static void main(String[] args) throws java.lang.Exception {

        List<Double> List1 = new LinkedList<Double>
                ((Arrays.asList(3.0, 3.0, 4.0, 4.0, 3.0, 4.0, 5.0, 4.0, 5.0, 5.0, 6.0)));

        List<Double> List2 = new LinkedList<Double>
                ((Arrays.asList(1.0, 2.0, 2.0, 4.0, 3.0, 3.0, 2.0, 1.0, 4.0, 2.0, 2.0, 3.0)));

        List<Double> List3 = new LinkedList<Double>
                ((Arrays.asList(2.0, 3.0, 5.0, 4.0, 2.0, 4.0, 3.0, 1.0, 4.0, 2.0, 3.0, 2.0, 4.0, 3.0, 4.0, 2.0)));

        List<Double> List4 = new LinkedList<Double>
                ((Arrays.asList(4.0, 5.0, 5.0, 5.0, 5.0, 6.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 6.0, 5.0, 5.0)));

        List<Double> List5 = new LinkedList<Double>
                ((Arrays.asList(4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0)));

        Grades gradesP1 = new Grades(List1);
        Grades gradesP2 = new Grades(List2);
        Grades gradesP3 = new Grades(List3);
        Grades gradesP4 = new Grades(List4);
        Grades gradesP5 = new Grades(List5);

        Student pupil1 = new Student("Luke", "Skywalker");
        Student pupil2 = new Student("Londo", "Molari");
        Student pupil3 = new Student("Jean-Luc", "Picard");
        Student pupil4 = new Student("Jack", "O’Neil");
        Student pupil5 = new Student("Simon", "Tam");

        HashMap<Student, Grades> theMap = new HashMap <Student, Grades> ();

        theMap.put(pupil1, gradesP1);
        theMap.put(pupil2, gradesP2);
        theMap.put(pupil3, gradesP3);
        theMap.put(pupil4, gradesP4);
        theMap.put(pupil5, gradesP5);

        for (Map.Entry <Student, Grades> entry: theMap.entrySet()) {

            Student student = entry.getKey();
            Grades grades = entry.getValue();

            System.out.println("Student " + student.getName() +
                    " " + student.getSurname() + " has grades average = " +
                    grades.calculateAverage());
        }
    }

}
