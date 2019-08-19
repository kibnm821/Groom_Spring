package com.example.groom_spring.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class Example{
    @RequestMapping(value = "/weather")
    public Object actionMethod(){
        RestTemplate restTemplate = new RestTemplate();
        String keyId = "35401e6e815d96876657f9a20945be7a";
        String targetUri = "https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid="+keyId;
        Object resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}