package com.example.groom_spring.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController

public class example{
    @RequestMapping(value = "/weather", method = RequestMethod.GET)
    public Object actionMethod(@RequestParam Map<String,Object> paramMap){

        RestTemplate restTemplate = new RestTemplate();

        String keyId = "35401e6e815d96876657f9a20945be7a";
        String targetUri = "https://samples.openweathermap.org/data/2.5/weather?id=1835848&appid="+keyId;
        Object resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}