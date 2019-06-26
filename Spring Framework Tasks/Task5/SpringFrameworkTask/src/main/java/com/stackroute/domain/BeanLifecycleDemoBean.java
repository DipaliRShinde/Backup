package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public void customInit()
    {
        System.out.println("In customInit");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("In destroy");
    }

    public void customDestroy()
    {
        System.out.println("In customDestroy");
    }
}
