package com.spring.learning;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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

    @Autowired
    @Qualifier("triangle.pointA")
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Autowired
    @Qualifier("triangle.pointB")
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    @Autowired
    @Qualifier("triangle.pointC")
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Triangle points::");
        System.out.println("Point A (" + this.getPointA().getX() + ", " + this.getPointA().getY() + ")");
        System.out.println("Point B (" + this.getPointB().getX() + ", " + this.getPointB().getY() + ")");
        System.out.println("Point C (" + this.getPointC().getX() + ", " + this.getPointC().getY() + ")");
    }

    @PostConstruct
    public void onInit() {
        System.out.println("---> Invoking after initialization of Triangle bean");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("---> Invoking before destruction of Triangle bean");
    }
}