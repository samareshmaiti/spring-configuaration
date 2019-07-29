package com.stackroute.annotation;

import com.stackroute.annotation.domain.Actor;
import com.stackroute.annotation.domain.Movie;
import com.stackroute.annotation.domain.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args ) {
//       ********************* First Assignment************************************

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(config.class);
       Actor actor = (Actor) annotationConfigApplicationContext.getBean("actorRole");
       Movie movie=(Movie) annotationConfigApplicationContext.getBean("movieRole");
        System.out.println(actor.toString());
        System.out.println(movie.toString());
//******************Second Assignment********************************
        Movie movie1 = annotationConfigApplicationContext.getBean("movie", Movie.class);
        Actor actor1 = annotationConfigApplicationContext.getBean("actor", Actor.class);
        System.out.println(movie1);
        System.out.println(actor1);
        //*************Third Assignment***********************
        Movie movie2 = annotationConfigApplicationContext.getBean("movie", Movie.class);
        Actor actor2 = annotationConfigApplicationContext.getBean("actor", Actor.class);
        System.out.println(movie2);
        System.out.println(actor2);
        //***********************Assignment4**************
        AnnotationConfigApplicationContext annotationConfigApplicationContext1 = new AnnotationConfigApplicationContext(config.class);

        Movie movie3 = annotationConfigApplicationContext.getBean("movie", Movie.class);
        Actor actor3 = annotationConfigApplicationContext.getBean("actor", Actor.class);
        System.out.println(movie3);
        System.out.println(actor3);


    }
}
