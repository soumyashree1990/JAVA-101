package com.luv2code;

/**
 * Created by personal on 04-04-2017.
 */
public class CricketCoach implements Coach {
    private FortuneService fortuneService;


    //Create a no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach : inside no-arg constructor");
    }

    //Our setter method
    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("CricketCoach : inside setter method");
        this.fortuneService=fortuneService;
    }
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
