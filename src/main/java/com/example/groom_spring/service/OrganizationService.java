package com.example.groom_spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationService{
    public Object actionMethod(){
        Map<String,Object> resultObject = new HashMap<String,Object>();
        resultObject.put("Member_id", "293029301202");
        resultObject.put("cellphone", "001-3923-6940");

        return resultObject;
    }
}