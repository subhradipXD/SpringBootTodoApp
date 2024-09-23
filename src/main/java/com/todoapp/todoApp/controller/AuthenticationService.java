package com.todoapp.todoApp.controller;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean Authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("Subhradip");
        boolean isValidPassword = password.equalsIgnoreCase("Joydas@2000");
        return isValidUserName && isValidPassword;
    }
}
