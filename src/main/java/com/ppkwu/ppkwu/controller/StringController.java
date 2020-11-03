package com.ppkwu.ppkwu.controller;

import com.ppkwu.ppkwu.domain.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("check/{stringToCheck}")
    public Response checkString(@PathVariable String stringToCheck) {
        int bigLetters = 0;
        int smallLetters = 0;
        int numbers = 0;
        int specials = 0;

        bigLetters = getBigLettersCount(stringToCheck);
        smallLetters = getSmallLettersCount(stringToCheck);
        numbers = getNumbersCount(stringToCheck);

        return new Response(bigLetters, smallLetters, numbers, specials);
    }

    public int getBigLettersCount(String stringToCheck) {
        if (stringToCheck == null || stringToCheck.trim().isEmpty()) return 0;

        int num = 0;
        for (int i=0;i<stringToCheck.length();i++) {
            if (stringToCheck.substring(i, i+1).matches("[A-Z]")) {
                num++;
            }
        }
        return num;
    }

    public int getSmallLettersCount(String stringToCheck) {
        if (stringToCheck == null || stringToCheck.trim().isEmpty()) return 0;

        int num = 0;
        for (int i=0;i<stringToCheck.length();i++) {
            if (stringToCheck.substring(i, i+1).matches("[a-z]")) {
                num++;
            }
        }
        return num;
    }

    public int getNumbersCount(String stringToCheck) {
        if (stringToCheck == null || stringToCheck.trim().isEmpty()) return 0;

        int num = 0;
        for (int i=0;i<stringToCheck.length();i++) {
            if (stringToCheck.substring(i, i+1).matches("[0-9]")) {
                num++;
            }
        }
        return num;
    }

}
