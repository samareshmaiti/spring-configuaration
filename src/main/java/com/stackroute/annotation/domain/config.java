package com.stackroute.annotation.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute.annotation.domain")
public class config {

    @Bean(name = "actorRole")
    public Actor movie1()
    {
        Actor actor =new Actor();
        return actor;
    }

    @Bean
    public Movie movie2()
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
}

