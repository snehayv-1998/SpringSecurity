package com.example.oauth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/api/v1/googleOauth/")
public class GoogleOauthController {
    @PostMapping("homePage")
    public String homePage(){
       return  "<html>\n" + "<header><title>Welcome to google oauth login!!</title></header>\n" +
                "<body>\n" + "Hello world\n" + "</body>\n" + "</html>";
    }
}
