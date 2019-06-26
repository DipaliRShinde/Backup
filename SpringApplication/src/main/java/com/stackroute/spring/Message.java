package com.stackroute.spring;

import org.springframework.stereotype.Component;

@Component
public class Message {
    private String message="This is the first demo Spring !!!!!!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
