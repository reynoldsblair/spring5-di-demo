package com.reynoldsblair.services;

import org.springframework.stereotype.Service;

/**
 * Created by ed.blair on 4/15/19.
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
