package com.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private Job job ;

    @Override
    public String toString() {
        return "User{" +
                "job=" + job +
                '}';
    }
}
