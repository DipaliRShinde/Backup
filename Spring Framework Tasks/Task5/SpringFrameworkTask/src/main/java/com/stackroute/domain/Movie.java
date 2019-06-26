package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    Actor actor;

    Movie() {

    }

    @Autowired
    Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("In setApplicationContext: " + applicationContext);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("In setBeanFactory: " + beanFactory);
    }

    public void setBeanName(String s) {
        System.out.println("In setBeanName: " + s);
    }
}
