package com.spring.boot.controller;

import com.spring.boot.annotations.SystemPropetiesConditional;
import com.spring.boot.aop.TestPointCut;
import com.spring.boot.services.Interfaces.ITestService;
import org.apache.tomcat.util.res.StringManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @AUTHOR liuqn
 * @DATE 2018/11/26 16:48
 * @VERSION v1.0
 * @DESCRIPTION TODO
 */
@RestController("testController")
public class TestController {

    private ITestService testService;
    @Autowired
    private TestPointCut testPointCut;
    @GetMapping("/test/{id}")
    public String  test(@PathVariable String id){
        System.out.println(id);
        /*testService.test();
        testPointCut.testThis();*/
        int a =1/0;
        return "seucess";
    }
    @Autowired
    public void setTestService(ITestService testService){
        this.testService = testService;
        System.out.println("setTestService........");
    }

    @PostConstruct
    public void init(){
        System.out.println("init..................");
    }
}
