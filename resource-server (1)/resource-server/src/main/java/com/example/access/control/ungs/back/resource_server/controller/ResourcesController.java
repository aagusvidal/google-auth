package com.example.access.control.ungs.back.resource_server.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/resources")
public class ResourcesController {


        @GetMapping("/path")
        public ResponseEntity<String> getMethodName(Authentication param) {
            return ResponseEntity.ok("The user can read" + param.getAuthorities());
        }

        @PostMapping("/path2")
        public ResponseEntity<String> write(Authentication param) {
            return ResponseEntity.ok("The user can read" + param.getAuthorities());
        }

}


