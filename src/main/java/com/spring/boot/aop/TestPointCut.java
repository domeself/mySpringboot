package com.spring.boot.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.RequiredTypes;
import org.aspectj.weaver.patterns.WithinAnnotationPointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Target;

/**
 * @AUTHOR liuqn
 * @DATE 2018/11/26 16:42
 * @VERSION v1.0
 * @DESCRIPTION TODO
 */
@Aspect
@Component
public class TestPointCut {
   /* @Pointcut("execution(public *  com.spring.boot.services..*())")
    public void pointCut1(){}*/

   /* @Pointcut("@annotation(com.spring.boot.annotations.TestAnnotation)")
    public void pointCut2(){}*/

  /* @Pointcut("target(com.spring.boot.services.Interfaces.ITestService)")
   public void pointCut2(){
       System.out.println("pointCut");
   }*/

    /*@Pointcut("this(com.spring.boot.services.Interfaces.ITestService)")
    public void pointCut2(){
        System.out.println("pointCut");
    }*/

    @Pointcut("this(com.spring.boot.services.Interfaces.ITestService)")
    public void pointCut2(){
        System.out.println("pointCut");
    }
    @Before(value = "pointCut2()")
    public void befor(){
        System.out.println("befor");
    }

    public void  testThis(){}
}
