package com.stackroute.annotation.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute.annotation.domain")
public class config {

    @Bean(name = "actorRole")
    public Actor actor1()
    {
        Actor actor =new Actor();
        return actor;
    }

    @Bean(name="movieRole")
    public Movie movie()
    {
        Movie movie=new Movie();
        movie.setActor(actor());
        return movie;
    }

    @Bean
    public Actor actor()
    {
        Actor actor = new Actor();

        return actor;
    }

    @Bean(name="beanLifeCycle")
    public BeanLifeCycleDemoBean beanLifeCycleDemoBean()
    {
        BeanLifeCycleDemoBean lifeCycleDemoBean=new BeanLifeCycleDemoBean();
        return lifeCycleDemoBean;
    }
    @Bean(name="beanPostProcessor")
    public BeanPostProcessorBean beanPostProcessorBean()
    {
        BeanPostProcessorBean postProcessorBean=new BeanPostProcessorBean();
        return postProcessorBean;
    }
}

