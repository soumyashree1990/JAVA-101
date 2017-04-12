package com.luv2code;

/**
 * Created by personal on 11-04-2017.
 */
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
