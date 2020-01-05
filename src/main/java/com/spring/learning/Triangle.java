package com.spring.learning;

public class Triangle {

    private Point[] points;

    public Triangle(Point[] points) {
        this.points = points;
    }

    public void draw() {
        System.out.println("Triangle points::");

        for (Point point : points) {
            System.out.println("Point (" + point.getX() + ", " + point.getY() + ")");
        }
    }
}