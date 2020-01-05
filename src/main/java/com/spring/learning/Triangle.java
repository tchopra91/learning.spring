package com.spring.learning;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {
        System.out.println("--> Triangle class constructor invoked.");
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Triangle points::");
        System.out.println("Point A (" + this.getPointA().getX() + ", " + this.getPointA().getY() + ")");
        System.out.println("Point B (" + this.getPointB().getX() + ", " + this.getPointB().getY() + ")");
        System.out.println("Point C (" + this.getPointC().getX() + ", " + this.getPointC().getY() + ")");
    }
}