package com.example.groom_spring.Controller;

import com.example.groom_spring.service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller{
    @Autowired
    OrganizationService OrganizationService;
    @RequestMapping(value = "/ws/organization")
    public Object actionMethod(){
        Object resultObject = new Object();
        resultObject = OrganizationService.actionMethod();
        return resultObject;
    }
}