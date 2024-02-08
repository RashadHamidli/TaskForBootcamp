package com.company;

import com.example.DevelopmentService;
import com.example.MyService;
import com.example.ProductionService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.Assert.assertEquals;


public class MyServiceTest {

    private final MyService myService;

    public MyServiceTest(MyService myService) {
        this.myService = myService;
    }

    @Test
    public void testProfile() {
        String info = myService.getInfo();
        assertEquals("this service is \"Test Service\"", info);
    }
}
