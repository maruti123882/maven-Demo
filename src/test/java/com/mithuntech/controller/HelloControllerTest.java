package com.mithuntech.controller;

import com.mithuntech.service.GreetingService;
import com.mithuntech.service.GreetingServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testGreet() {

        // Use real implementation (NO Mockito needed here)
        GreetingService service = new GreetingServiceImpl();

        HelloController controller = new HelloController(service);

        ResponseEntity<String> response = controller.greet("Mithun");

        assertEquals("Hello Mithun, welcome to Mithun Tech Training!", response.getBody());
    }

    @Test
    void testHealth() {
        GreetingService service = new GreetingServiceImpl();

        HelloController controller = new HelloController(service);

        ResponseEntity<String> response = controller.health();

        assertEquals("Application is Healthy!", response.getBody());
    }
}
