package com.stackroute.annotation.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute.annotation")
public class config {
    @Bean
    public Movie movie1()
    {
        Movie movie1=new Movie();
        movie1.setActor(actor());
        return new Movie();
    }

    @Bean
    public Movie movie()
    {
        Movie movie=new Movie();
        movie.setActor(actor());
        return new Movie();
    }

    @Bean
    public Actor actor()
    {
        Actor actor=new Actor();

        return new Actor();
    }
}

