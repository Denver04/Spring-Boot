package com.example.practice.CustomAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //this is defining scope of annotation
@Target(ElementType.METHOD) // this is defining where we can use this annotation
public @interface annotation1 {
    
}
