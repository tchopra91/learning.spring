package com.spring.learning;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor :: Invoking after initialization of " + beanName + " bean.");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor :: Invoking before initialization of " + beanName + " bean.");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}