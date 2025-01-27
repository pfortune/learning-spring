package com.fortune.springboot.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose "/" endpoint that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 55k!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
