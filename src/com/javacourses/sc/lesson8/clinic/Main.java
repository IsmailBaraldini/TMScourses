package com.javacourses.sc.lesson8.clinic;
import com.javacourses.sc.lesson8.clinic.Patient;
public class Main
{
    public static void main(String[] args) {

        Patient patient1 = new Patient("Louis", 2);
        Patient patient2 = new Patient("Elen", 1);
        Patient patient3 = new Patient("George", 3);
        Patient patient4 = new Patient("Alex", 4);

        patient1.getTreatmentProtocol("4", "Anna");
        System.out.println(patient1);
    }
}
