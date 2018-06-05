package com.spring.learn;

import com.spring.component.Book;
import com.spring.component.User;
import com.spring.configuration.AConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpring {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AConfiguration.class); //AConfiguration中配置了默认扫描路径，路径中包括BConfiguration类，
                                                                        //BConfiguration类中对Book类进行了加载

        Book book = context.getBean(Book.class);
        System.out.println(book);

    }

}
