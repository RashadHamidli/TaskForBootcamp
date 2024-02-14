package com.company;

import com.example.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class MyServiceTest {

    private MyService myService;

    @Test
    public void testProfile() {
        String info = myService.getInfo();
        assertEquals("this service is \"Test Service\"", info);
    }
}
