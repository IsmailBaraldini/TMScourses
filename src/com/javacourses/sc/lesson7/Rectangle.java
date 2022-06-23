package com.javacourses.sc.lesson7;

public class Rectangle implements Figures {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getGirth() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
