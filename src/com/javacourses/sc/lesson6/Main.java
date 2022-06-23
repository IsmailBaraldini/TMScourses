package com.javacourses.sc.lesson6;

public class Main {
    public static void main(String[] args) {

        CreditСard creditCard = new CreditСard("1111 2222 3333 4444",1000);
        CreditСard creditСard2 = new CreditСard("2222 4444 5555 7777", 500);
        CreditСard creditСard3 = new CreditСard("8888 6666 4444 1111", 200);


        creditCard.addAmount(50);
        creditСard2.addAmount(100);
        creditСard3.withdrawAmount(50);

        System.out.println(creditCard + " ");
        System.out.println(creditСard2 + " ");
        System.out.println(creditСard3 + " ");
    }
}
