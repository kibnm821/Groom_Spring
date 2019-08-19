package com.example.groom_spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class exampleService{
    public Object actionMethod(){
        Map<String,Object> resultObject = new HashMap<String,Object>();
        resultObject.put("country","FR");
        return resultObject;
    }

	public Object getForObject(String targetUri, Class<Object> class1) {
		return null;
	}
}