package com.e.commerce.backend.email;

public interface EmailSender {
    void send(String to, String email) throws IllegalAccessException;
}
