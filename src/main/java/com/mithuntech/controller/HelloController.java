package com.mithuntech.controller;

import com.mithuntech.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final GreetingService service;

    public HelloController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greet(@RequestParam(defaultValue = "Candidate") String name) {
        return ResponseEntity.ok(service.greet(name));
    }
}
