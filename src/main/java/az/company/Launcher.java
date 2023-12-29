package az.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
//        Message message1 = context.getBean("message1",Message.class);
//        Message message2 = context.getBean("message2",Message.class);
//        message1.print();
//        message2.print();
        int count = context.getBeanDefinitionCount();
        System.out.println(count);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
