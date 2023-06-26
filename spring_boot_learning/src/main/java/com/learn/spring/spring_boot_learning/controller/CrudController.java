package com.learn.spring.spring_boot_learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/crud")
public class CrudController {

    List<String> nameList = new ArrayList<>();

    @RequestMapping("/")
    public String test(){
        return "Test API works";
    }

    @RequestMapping("/load")
    public String load(){
        nameList.addAll(Arrays.asList("Vishnu","Hasan","John","David"));
        return "load successful";
    }



}
