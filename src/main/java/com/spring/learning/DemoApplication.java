package com.spring.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Running main method of DemoApplication");

        // Preparing core context using bean factory to initialize spring.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Getting bean instance from factory.
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }

}
