package com.example.apitwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeckController {

    @GetMapping("/deck")
    public String deck() {
        return "Deck is working";
    }
}
