package com.javacourses.sc.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = "enter NUMBER of month: ";

        Scanner scanner = new Scanner(System.in);

        int monthNumber = getMonthNumber(scanner); //number of month

        switch (monthNumber) {
            case 1:
                System.out.print("January");
                return;
            case 2:
                System.out.print("February");
                return;
            case 3:
                System.out.print("March");
                return;
            case 4:
                System.out.print("April");
                return;
            case 5:
                System.out.print("May");
                return;
            case 6:
                System.out.println("June");
                return;
            case 7:
                System.out.print("July");
                return;
            case 8:
                System.out.print("August");
                return;
            case 9:
                System.out.print("September");
                return;
            case 10:
                System.out.println("October");
                return;
            case 11:
                System.out.print("November");
                return;
            case 12:
                System.out.print("December");
                return;
            default:
                System.out.print("Wrong number");
        }
    }

    public static int getMonthNumber(Scanner scanner) {
        String string = scanner.nextLine();
        String msg = "Enter correct number of month! Number of month: ";
        while (!checkValidValue(string)) {
            string = scanner.next();
        }
        return Integer.parseInt(string);
    }

    public static boolean checkValidValue(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
