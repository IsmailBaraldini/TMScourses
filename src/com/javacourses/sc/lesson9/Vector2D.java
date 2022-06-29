package com.javacourses.sc.lesson9;

public class Vector2D
{
    private double x;
    private double y;


    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void result() {
        System.out.println("Vector2D {x=" + x + ", y=" + y + "}");
    }
    public double length1() {
    return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
