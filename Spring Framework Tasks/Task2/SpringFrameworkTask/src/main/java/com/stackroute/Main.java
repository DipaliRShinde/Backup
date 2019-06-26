package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        //Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie beanA = (Movie) context.getBean("MovieA");
        Movie beanB = (Movie) context.getBean("MovieB");
        Movie beanC = (Movie) context.getBean("MovieC");
        System.out.println(beanA.toString());
        System.out.println(beanB.toString());
        System.out.println(beanC.toString());

        System.out.println(beanA==beanB);
    }
}
