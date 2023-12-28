package az.company.config;

import az.company.entities.Message;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.Singular;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;

@org.springframework.context.annotation.Configuration
@ComponentScan
public class Configuration {
    @Bean
   public EntityManagerFactory entityManagerFactory(){
        return Persistence.createEntityManagerFactory()
    }


}
