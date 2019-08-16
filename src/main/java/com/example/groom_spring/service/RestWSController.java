package com.example.groom_spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class RestWSController{
    public Object actionMethod(){
        ArrayList<Object> resultObject = new ArrayList<Object>();//list make

        Map<String,Object> data01 = new HashMap<String,Object>();//make map 3
        Map<String,Object> data02 = new HashMap<String,Object>();
        Map<String,Object> data03 = new HashMap<String,Object>();

        data01.put("Member_Id","alfa");//input data 01
        data01.put("Member_PW","1q2w3e4r5t!!");
        data01.put("Member_Email","text");
        resultObject.add(data01);//input objcet

        data02.put("Member_Id","bravo");//input data 01
        data02.put("Member_PW","security");
        data02.put("Member_Email","email");
        resultObject.add(data02);//input objcet

        data03.put("Member_Id","charlie");//input data 01
        data03.put("Member_PW","010100001101");
        data03.put("Member_Email","aaaa");
        resultObject.add(data03);//input objcet

        return resultObject;
    }
}