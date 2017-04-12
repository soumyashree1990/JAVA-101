package com.luv2code;

/**
 * Created by personal on 11-04-2017.
 */
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune(){
        return "Today is a sad day";
    }
}
