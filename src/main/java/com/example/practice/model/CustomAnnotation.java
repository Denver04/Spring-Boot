package com.example.practice.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomAnnotation {
    
    @Pointcut("@annotation(com.example.practice.CustomAnnotation.annotation1)")
    public void handleAnnotation(){
        // Logic to handle custom annotation
    } 

    @Before("handleAnnotation()")
    public void executeBeforeCustomLogic() {
        // This method can be used to execute logic when the annotation is encountered
        System.out.println("Executing custom logic Before the annotation.");
    }
    @After("handleAnnotation()")
    public void executeAfterCustomLogic() {
        // This method can be used to execute logic when the annotation is encountered
        System.out.println("Executing custom logic After the annotation.");
    }
}
