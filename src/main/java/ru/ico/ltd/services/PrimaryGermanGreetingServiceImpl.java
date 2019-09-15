package ru.ico.ltd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryGermanGreetingServiceImpl implements GreetingService {

    private GreetingRepository repository;

    public PrimaryGermanGreetingServiceImpl(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return repository.getGermanGreeting();
    }
}
