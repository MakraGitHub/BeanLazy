package com.makara.java.school;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("com.makara.java.school")
public class BeanConfig {

   // @Bean(initMethod = "setup" , destroyMethod = "clear")
    @Bean
    public Student getStudent(){

        Student student = new Student();
        //student.s
        //return new Student();
        return student;
    }
    @Bean
    @Lazy
    public Subject getSubject(){
        return new Subject();
    }

}
