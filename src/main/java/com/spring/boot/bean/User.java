package com.spring.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @AUTHOR liuqn
 * @DATE 2018/12/19 14:35
 * @VERSION v1.0
 * @DESCRIPTION TODO
 */
@ConfigurationProperties
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
