package com.luv2code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by personal on 11-04-2017.
 */

@Configuration
//@ComponentScan("com.luv2code")
public class SportConfig {

    //Define bean for our Sad Fortune Service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //Define bean for our swim coach and inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());

    }

}
