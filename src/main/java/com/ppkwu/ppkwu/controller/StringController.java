package com.ppkwu.ppkwu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("check/{stringToCheck}")
    public String checkString(@PathVariable String stringToCheck) {
        int bigLetters = 0;
        int smallLetters = 0;
        int numbers = 0;
        int specials = 0;

        return "";
    }

}
