package com.makara.java.school;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Subject {
    private String title;

    @PostConstruct
    public void init(){
        System.out.println("subject created ");
    }
    @PreDestroy
    public void clearUp(){
        System.out.println("Subject destroy ");
    }
    public void setSubject(){
        System.out.println("setSubject Method is called ");
    }
}
