package com.spring.learning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Running main method of DemoApplication");

        // Preparing resource to read spring.xml file.
        Resource resource = new ClassPathResource("spring.xml");

        // Preparing core context using bean factory to initialize spring.
        BeanFactory factory = new XmlBeanFactory(resource);

        // Getting bean instance from factory.
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();
    }

}
