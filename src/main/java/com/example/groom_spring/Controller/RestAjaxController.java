package com.example.groom_spring.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

class RestAjaxController{
    @RequestMapping(value = "/ws/RestAjaxController")
    public String getParmWithAjax(@RequestParam Map<String,Object> paramMap){
        String str = (String) paramMap.get("title");
        return "Welcome to Hellow Wrold !!";
    }
}