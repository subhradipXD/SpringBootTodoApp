package com.todoapp.todoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String simpleHello() {
        return "hello world!";
    }

    @RequestMapping("/hello-html")
    @ResponseBody
    public String simpleHelloHtml() {

        StringBuilder sb = new StringBuilder();

        sb.append("<!DOCTYPE html>");
        sb.append("<html>");

        sb.append("<head>");
        sb.append("<title>Document</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>hello with html tag!</h1>");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @RequestMapping("/")
    public String simpleHelloJsp() {

        return "sayHello";
    }

    @RequestMapping("second")
    public String simpleHelloJspSecond() {

        return "sayHelloSecond";
    }
}
