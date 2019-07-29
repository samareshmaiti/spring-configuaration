package com.stackroute.annotation.domain;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//import javax.annotation.PostConstruct;
import javax.annotation.*;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties SET printing");
    }
    //    custom init method
    @PostConstruct
    public void customInit() {
        System.out.println("Custom Init Method ");
    }

    //    custom destroy method
    @PreDestroy
    public void customDestroy() {
        System.out.println("Custom Destroy method ");
    }
}