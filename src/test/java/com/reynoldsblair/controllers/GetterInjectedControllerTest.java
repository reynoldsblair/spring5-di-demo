package com.reynoldsblair.controllers;

import com.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ed.blair on 4/15/19.
 */
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}