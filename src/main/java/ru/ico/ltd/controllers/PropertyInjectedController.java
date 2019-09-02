package ru.ico.ltd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.ico.ltd.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
