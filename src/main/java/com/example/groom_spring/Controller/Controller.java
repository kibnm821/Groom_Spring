package com.example.groom_spring.Controller;

import com.example.groom_spring.service.RestWSController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller{
    @Autowired
    RestWSController restWSController;
    @RequestMapping(value = "/ws/organization")
    public Object actionMethod(){
        Object resultObject = new Object();
        resultObject = restWSController.actionMethod();
        return resultObject;
    }
}