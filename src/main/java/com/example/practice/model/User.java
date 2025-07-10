package com.example.practice.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private int age;
    private String currentCompany;
    private String location;

    public User() {}

    public User(String name, int age, String currentCompany, String location){
        this.name = name;
        this.age = age;
        this.currentCompany = currentCompany;
        this.location = location;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCurrentCompany(){
        return currentCompany;
    }

    public void setCurrentCompany(String currentCompany){
        this.currentCompany = currentCompany;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }
    
}
