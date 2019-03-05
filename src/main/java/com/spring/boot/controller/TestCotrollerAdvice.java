package com.spring.boot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice (assignableTypes = TestController.class)
public class TestCotrollerAdvice {
    @ExceptionHandler(RuntimeException.class)
    public String advice1(){
        System.out.println("advice1");
        return "advice1";
    }

    public void advice2(){
        System.out.println("advice2");
    }
}
