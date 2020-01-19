package com.spring.learning;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    private MessageSource messageSource;

    public Triangle() {
        System.out.println("--> Triangle class constructor invoked.");
    }

    public Point getPointA() {
        return pointA;
    }

    @Resource
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Resource
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    @Resource
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Resource
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void draw() {
        System.out.println("Message source greeting from triangle class :: "
                + messageSource.getMessage("greeting", null, "Default greeting", null));
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