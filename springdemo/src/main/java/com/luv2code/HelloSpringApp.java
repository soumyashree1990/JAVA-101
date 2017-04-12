package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by personal on 04-04-2017.
 */
public class HelloSpringApp {
    public static void main(String[] args) {
        //Load spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach= (Coach) context.getBean("myCoach",Coach.class);


        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        //call new method
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
