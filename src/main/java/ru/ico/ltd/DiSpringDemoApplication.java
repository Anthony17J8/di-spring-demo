package ru.ico.ltd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.ico.ltd.controllers.MyController;
import ru.ico.ltd.examplebeans.FakeDataSource;

@SpringBootApplication
public class DiSpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());
    }
}
