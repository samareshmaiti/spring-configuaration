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
        System.out.println(actor.toString());
//******************Second Assignment********************************
        Movie movie = annotationConfigApplicationContext.getBean("movie", Movie.class);
        Actor actor1 = annotationConfigApplicationContext.getBean("actor", Actor.class);
        System.out.println(movie);
        System.out.println(actor1);
        //*************Third Assignment***********************
        Movie movie2 = annotationConfigApplicationContext.getBean("movie", Movie.class);
        Actor actor2 = annotationConfigApplicationContext.getBean("actor", Actor.class);
        System.out.println(movie2);
        System.out.println(actor2);

    }
}
