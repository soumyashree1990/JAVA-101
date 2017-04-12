package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by personal on 04-04-2017.
 */
public class SetterDemoApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach theCoach= (CricketCoach) context.getBean("myCricketCoach",CricketCoach.class);

        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();


    }
}
