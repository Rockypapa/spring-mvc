package com.rocky.mall.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonDataController {
    @RequestMapping("/testJson.do")
    public String testJson(){
        System.out.println("enter testJson method");
        return "testJson";
    }
}
