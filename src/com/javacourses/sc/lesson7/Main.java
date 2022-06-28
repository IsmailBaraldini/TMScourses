package com.javacourses.sc.lesson7;

public class Main {
    public static void main(String[] args) {
        Circle areaCircle = new Circle(23);
        System.out.println("The area of the Circle is : " + areaCircle.getArea());
        System.out.println("The Perimetr of the Circle is : " + areaCircle.getGirth());
        Triangle areaTriangle = new Triangle(12, 12, 13);
        System.out.println("The area of the Triangle is : " + areaTriangle.getArea());
        System.out.println("The perimetr of the Triangle is : " + areaTriangle.getGirth());
        Rectangle areaRectangle = new Rectangle(23, 42);
        System.out.println("The area of the Rectangle is : " + areaRectangle.getArea());
        System.out.println("The perimetr of the Rectangle is : " + areaRectangle.getGirth());

    }
//    Circle circle = new Circle(2);
//    Figures figure = circle;
}
