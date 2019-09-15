package ru.ico.ltd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryGreetingServiceImpl implements GreetingService {

    private GreetingRepository repository;

    public PrimaryGreetingServiceImpl(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return repository.getEnglishGreeting();
    }
}
