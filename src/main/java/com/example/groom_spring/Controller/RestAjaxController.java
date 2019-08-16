package com.example.groom_spring.Controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

class RestAjaxController{
    @RequestMapping(value = "/ws/RestAjaxController", method = RequestMethod.POST)
    public Object getParmWithAjax(@RequestParam Map<String, Object> paramMap) {

        String str = (String) paramMap.get("title");
        String str1 = (String) paramMap.get("description");

        ArrayList<Object> aaa = new ArrayList<Object>();

        aaa.add(str);
        aaa.add(str1);
        return aaa;
    }
}