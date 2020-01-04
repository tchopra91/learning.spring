package com.spring.learning;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {

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
        System.out.println("Point A [ " + this.pointA.getX() + ", " + this.pointA.getY() + " ]");
        System.out.println("Point B [ " + this.pointB.getX() + ", " + this.pointB.getY() + " ]");
        System.out.println("Point C [ " + this.pointC.getX() + ", " + this.pointC.getY() + " ]");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init method called for Triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method called for Triangle");
    }

    public void onInit() {
        System.out.println("My init method called for Triangle");
    }

    public void onDestroy() {
        System.out.println("My destroy method called for Triangle");
    }

}