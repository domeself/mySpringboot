package com.spring.boot;



import com.spring.boot.annotations.EnableTest;
import com.spring.boot.annotations.SystemPropetiesConditional;
import com.spring.boot.bean.CreateConfigBean;
import com.spring.boot.bean.Lamda;
import com.spring.boot.bean.User;
import com.spring.boot.configuration.TestAutoConfiguration;
import com.spring.boot.controller.TestController;
import com.spring.boot.services.Interfaces.IProfile;
import com.spring.boot.services.Interfaces.ITestService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


public class TestApplication {
    public static void main(String[] args) {


       ConfigurableApplicationContext context = new SpringApplicationBuilder(BootApplication.class).web(WebApplicationType.NONE).run(args);
       /* ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        BeanDefinition testController = beanFactory.getBeanDefinition("TestController.value");
        System.out.println();*/


    }


}
