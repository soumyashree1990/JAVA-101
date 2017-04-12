package com.luv2code;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by personal on 11-04-2017.
 */
public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        //load the spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //retrieve bean from spring container
        Coach theCoach = (Coach) context.getBean("SwimCoach", Coach.class);

        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
