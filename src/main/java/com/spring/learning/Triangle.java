package com.spring.learning;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements ApplicationEventPublisherAware {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    private MessageSource messageSource;
    private ApplicationEventPublisher eventPublisher;

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
                + messageSource.getMessage("greeting", null, "Default greeting", Locale.FRENCH));
        System.out.println("Triangle points::");
        System.out.println("Point A (" + this.getPointA().getX() + ", " + this.getPointA().getY() + ")");
        System.out.println("Point B (" + this.getPointB().getX() + ", " + this.getPointB().getY() + ")");
        System.out.println("Point C (" + this.getPointC().getX() + ", " + this.getPointC().getY() + ")");
        this.eventPublisher.publishEvent(new DrawEvent(this));
    }

    @PostConstruct
    public void onInit() {
        System.out.println("---> Invoking after initialization of Triangle bean");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("---> Invoking before destruction of Triangle bean");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}