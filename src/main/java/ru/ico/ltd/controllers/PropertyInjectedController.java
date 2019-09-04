package ru.ico.ltd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ru.ico.ltd.services.GreetingService;

@Controller
public class PropertyInjectedController {

    /**
     * It's possible not to use @Qualifier annotation.
     * We can use name of property variables as a Bean name with lower case at the begin.
     * But it's not always apparent, so use @Qualifier in that case.
     */
    @Autowired
    // have to define @Qualifier because @Primary overrides wiring method
    // without this primary implementation will be injected
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
