package com.e.commerce.e_commerce.email;

public interface EmailSender {
    void send(String to, String email) throws IllegalAccessException;
}
