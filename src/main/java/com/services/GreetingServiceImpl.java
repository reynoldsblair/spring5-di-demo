package com.services;

import org.springframework.stereotype.Service;

/**
 * Created by ed.blair on 4/15/19.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
