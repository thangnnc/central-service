package com.polysocial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HomeController {

    @GetMapping("/status")
    public HashMap getHome(){
        HashMap<String, String> response = new HashMap<>();
        response.put("Status", "Running");
        return response;
    }
}
