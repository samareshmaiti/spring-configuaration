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
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie = (Movie) context.getBean("movie");
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(config.class);
       Movie movie1=annotationConfigApplicationContext.getBean("movie1",Movie.class);
        System.out.println(movie1);

        Movie movie = annotationConfigApplicationContext.getBean("movie", Movie.class);
        Actor actor = annotationConfigApplicationContext.getBean("actor", Actor.class);
       // Movie movie2 = annotationConfigApplicationContext.getBean("movieBean2", Movie.class);
        System.out.println(movie);
        System.out.println(actor);
    }
}
