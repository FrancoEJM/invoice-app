package com.invoice.app.spring_backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins="*")
public class UserController {
    @GetMapping("/data")
    public Map<String, String> status() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "Hola Chagod");
        return response;
    }
}

