package com.learn.spring.spring_boot_learning.controller;

public class RestException extends RuntimeException{
    public RestException(String msg){
        super(msg);
    }
}
