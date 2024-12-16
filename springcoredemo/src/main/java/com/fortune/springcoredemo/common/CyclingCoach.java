package com.fortune.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CyclingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Cycling for 30 minutes.";
    }
}
