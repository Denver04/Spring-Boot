package com.example.practice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.practice.model.User;

@Service
public class UserService {

    List<User> allUsers = new ArrayList<>(Arrays.asList(new User("Spidey", 22, "LKO", "Hyd"),
            new User("Noux", 23, "SocGen", "Banglore"),
            new User("Shadow", 21, "JUI", "Delhi")));

    
    public List<User> getAllUsers(){
        return allUsers;
    }

    public User getUser(int age){
        User requiredUser = allUsers.stream().
                            filter((user) -> user.getAge() == age).findFirst().get();

        return requiredUser;
    }

    public User getUserByName(String name){
        User requiredUser = allUsers.stream()
        .filter(user -> user.getName().equalsIgnoreCase(name))
        .findFirst()
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

        return requiredUser;
    }

    public void addUser(User user){
        allUsers.add(user);
    }
}
