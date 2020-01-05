package com.spring.learning;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Running main method of DemoApplication");

        // Preparing core context using bean factory to initialize spring.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // In case, either scope is not set or set to singleton for Triangle bean,
        // the constructor will be invoked once only.

        // Getting bean instance from factory.
        Triangle triangle = (Triangle) context.getBean("triangle");
        // triangle.draw();

        // Getting bean instance from factory.
        Triangle triangle2 = (Triangle) context.getBean("triangle");

        // Either register shutdownHook,
        // context.registerShutdownHook();
        // Or simply invoke close method of AbstractApplicationContext to prevent
        // leaking.
        context.close();
    }

}
