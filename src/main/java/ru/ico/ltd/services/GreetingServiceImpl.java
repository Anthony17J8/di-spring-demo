package ru.ico.ltd.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private static final String HELLO = "HELLO";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
