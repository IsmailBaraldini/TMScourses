package com.javacourses.sc.lesson6;

public class CreditСard {
    String cardNumber;
    double currentAmount;

    public CreditСard() {
    }

    public CreditСard(String cardNumber, double currentAmount) {
        this.cardNumber = cardNumber;
        this.currentAmount = currentAmount;
    }

    void addAmount(double newAmount) {
        currentAmount += newAmount;
    }

    void withdrawAmount(double newAmount) {
        currentAmount -= newAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public String toString() {
        return "CreditСard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", currentAmount=" + currentAmount +
                '}';
    }
}
