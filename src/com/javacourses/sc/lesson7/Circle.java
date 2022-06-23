package com.javacourses.sc.lesson7;

public class Circle implements Figures {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getGirth() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}

