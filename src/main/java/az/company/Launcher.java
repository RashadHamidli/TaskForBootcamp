package az.company;

import az.company.config.Configuration;
import az.company.entities.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Message message = context.getBean("message2",Message.class);
        message.print();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
