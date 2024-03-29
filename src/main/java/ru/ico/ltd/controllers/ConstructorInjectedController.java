package ru.ico.ltd.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ru.ico.ltd.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // @Autowired // - optional for constructor injection
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
