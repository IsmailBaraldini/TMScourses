package com.javacourses.sc.lesson9;

public class Vector3D {
    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void result() {
        System.out.println("Vector3D {x=" + x + " ,y=" + y + " ,z=" + z + "}");
    }

    public double length(double x, double y, double z) {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
