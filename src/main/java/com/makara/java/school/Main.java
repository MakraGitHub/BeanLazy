package com.makara.java.school;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfig.class);

        context.registerShutdownHook();//ប្រាប់ signal method មុននិង Application stop .
        //context.close();
        System.out.println("Application started ");
        Student student = context.getBean(Student.class);
        Student student2 = context2.getBean(Student.class);
/*
        student.display();
        //Subject subject = context.getBean(Subject.class);
        System.out.println("Finish Application ");
        //context.close();
 */
        System.out.println(System.identityHashCode(student));
        System.out.println(System.identityHashCode(student2));
        //this is code student on console screen.

    }
}