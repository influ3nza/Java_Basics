package com.example.springbootprimary.util;

import lombok.Data;

@Data
public class Message {
    private String message;

    private boolean flag;

    public Message(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }
}
