package com.luv2code;

/**
 * Created by personal on 03-04-2017.
 */
public class BaseballCoach implements Coach {
    //define a private field for the depedency
    private FortuneService fortuneService;

    //Define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
