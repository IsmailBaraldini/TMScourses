package com.javacourses.sc.lesson9;

public class Main {
    public static void main(String[] args) {
        Vector2D st = new Vector2D(10.2, 6);
        st.result();
        double length1 = st.length1();
        System.out.println("Length=" + length1);
        Vector3D sf = new Vector3D(21.2, 42, 12);
        double length = sf.length(21.2, 42, 12);
        sf.result();
        System.out.println(("Length=" + length));
    }
}
