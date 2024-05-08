package com.e.commerce.backend.email;

public interface EmaillSender {
    void send(String to, String email) throws IllegalAccessException;
}
