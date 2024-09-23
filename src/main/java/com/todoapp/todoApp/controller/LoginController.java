package com.todoapp.todoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    // @RequestMapping("/login")
    // public String Login(@RequestParam String name, ModelMap model) {
    // model.put("name", name);
    // System.out.println("the name is " + name);
    // return "login";
    // }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String Login() {
        return "login";
    }

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Welcome(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (authenticationService.Authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }

        model.put("errorMsg", "Invalid Credentials. Please Try again!");
        return "login";

    }

}