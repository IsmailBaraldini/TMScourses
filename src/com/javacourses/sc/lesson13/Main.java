package com.javacourses.sc.lesson13;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Markus", 4.68f);
        Student student1 = new Student("Lion", 3.99f);
        Student student2 = new Student("Max", 4.02f);
        Student student3 = new Student("Henry", 3.28f);
        Student student4 = new Student("Sofie", 4.98f);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMark() < 4f) {
            }
            students.remove(students.get(i));
        }
        System.out.println(students);
    }
}
