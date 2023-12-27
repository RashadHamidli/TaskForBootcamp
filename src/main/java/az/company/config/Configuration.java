package az.company.config;

import az.company.entities.Message;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean(name = "message1")
    public Message message() {
        Message message = new Message();
        message.setName("Linkedin message");
        return message;
    }
    @Bean(name = "message2")
    public Message message2() {
        Message message = new Message();
        message.setName("Facebook message");
        return message;
    }


}
