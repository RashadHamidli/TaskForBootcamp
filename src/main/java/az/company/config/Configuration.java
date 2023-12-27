package az.company.config;

import az.company.entities.Message;
import lombok.Singular;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;

@org.springframework.context.annotation.Configuration
@ComponentScan
public class Configuration {
    @Bean(name = "message1")
    public Message message() {
        Message message = new Message();
        message.setName("Linkedin message");
        return message;
    }
    @Bean(name = "message2")
    @DependsOn
    public Message message2() {
        Message message = new Message();
        message.setName("Facebook message");
        return message;
    }


}
