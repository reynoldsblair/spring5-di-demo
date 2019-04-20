package com.reynoldsblair.controllers;

import com.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by ed.blair on 4/15/19.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }
}
