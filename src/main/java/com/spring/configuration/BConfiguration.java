package com.spring.configuration;


import com.spring.component.Book;
import com.spring.component.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BConfiguration {

    @Bean
    public Book createBook(){
        return new Book();
    }

}
