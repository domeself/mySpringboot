package com.spring.boot.bean;

import com.spring.boot.annotations.SystemPropetiesConditional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



public class CreateConfigBean {

    public String testEnable(){
        return "testEnable";
    }
}
