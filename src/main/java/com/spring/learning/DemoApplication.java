package com.spring.learning;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Running main method of DemoApplication");

        // Preparing core context using bean factory to initialize spring.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Fetching greeting message from context.
        String greetingMsg = context.getMessage("greeting", null, "Default greeting", null);
        System.out.println("Greeting message :: " + greetingMsg);

        // Getting bean instance from factory.
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

        // Either register shutdownHook,
        // context.registerShutdownHook();
        // Or simply invoke close method of AbstractApplicationContext to prevent
        // leaking.
        context.close();
    }

}
