package com.luv2code.springcoredemo.common;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.stereotype.Component;

@Component //Spring Bean
public class CricketCoach implements Coach {

    @Override
    public String GetDailyWorkout() {
        return "Practise fast bowling for 15 minutes!!!!";
    }
}
