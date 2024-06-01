package com.example.access.control.ungs.back.client_app.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth2Controller {
    
    @GetMapping("/hello")
    public ResponseEntity<String> hello ()
    {
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/authorized")
    public Map<String,String> authorized(@RequestParam String code) {
        return Collections.singletonMap("authorizationCode", code);
    }
    
}