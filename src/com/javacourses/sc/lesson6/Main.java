package com.javacourses.sc.lesson6;

public class Main {
    public static void main(String[] args) {

        CreditСard creditCard = new CreditСard();
        CreditСard creditСard2 = new CreditСard();
        CreditСard creditСard3 = new CreditСard();

        creditCard.addAmount(50);
        creditСard2.addAmount(100);
        creditСard3.withdrawAmount(50);

        System.out.println(creditCard + " ");
        System.out.println(creditСard2 + " ");
        System.out.println(creditСard3 + " ");
    }
}
