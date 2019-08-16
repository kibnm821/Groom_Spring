package com.example.groom_spring.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class post{
    @RequestMapping(value = "/api/ajax", method = RequestMethod.POST)
    public String getParmWithAjax(){
        return "Welcome to Hellow Wrold !!";
    }
}