package com.e.commerce.e_commerce.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidater implements Predicate<String> {
    @Override
    public boolean test(String s){
        // todo: regex for email validation
        return true;
    }
}
