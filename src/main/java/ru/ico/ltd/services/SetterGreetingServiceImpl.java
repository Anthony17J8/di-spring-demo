package ru.ico.ltd.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}
