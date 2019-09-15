package ru.ico.ltd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.ico.ltd.controllers.ConstructorInjectedController;
import ru.ico.ltd.controllers.MyController;
import ru.ico.ltd.controllers.PropertyInjectedController;
import ru.ico.ltd.controllers.SetterInjectedController;

@SpringBootApplication(scanBasePackages = {"ru.ico.services", "ru.ico.ltd.controllers"})
public class DiSpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.greeting());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
