package com.spring.boot.services.impl;

import com.spring.boot.annotations.TestAnnotation;
import com.spring.boot.services.Interfaces.ITestService;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR liuqn
 * @DATE 2018/11/26 16:55
 * @VERSION v1.0
 * @DESCRIPTION TODO
 */
@Service
public class TestServiceImpl implements ITestService {
    @Override
    @TestAnnotation(value = true    )
    public void test(int a) {
        System.out.println("TestServiceImpl.test");
    }
}
