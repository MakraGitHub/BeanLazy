package com.makara.java.school;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class Student /*implements InitializingBean, DisposableBean */{

    //@Autowired
    //@Lazy
    //private Subject subject;

    @PostConstruct
    public void setup(){
        System.out.println("student created ");
    }
    @PreDestroy// ត្រូវបាន called មុនពេល object និង ត្រូវបាន Clean
    public void clear(){
        System.out.println("Student destroy ");
    }
    public void display(){
        //subject.setSubject();
        System.out.println("Display from student ");
    }


   // @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Student created");
    }

   // @Override
    public void destroy() throws Exception {
        System.out.println("Student destroy ");
    }
}
