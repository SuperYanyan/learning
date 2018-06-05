package com.spring.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

    @PostConstruct
    private void postConstruct(){
        System.out.println("------postConstruct-----");
    }

    @PreDestroy
    private void preDestroy(){
        System.out.println("---------preDestroy--------");
    }

}
