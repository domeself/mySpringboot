package com.spring.boot;


import com.spring.boot.annotations.EnableTest;
import com.spring.boot.annotations.SystemPropetiesConditional;
import com.spring.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;


@SpringBootApplication
public class BootApplication {

    /*public static void main(String[] args)  {

        ConfigurableApplicationContext context = SpringApplication.run(BootApplication.class, args);
        System.out.println(context.getBean(User.class));


    }*/


    @Bean
    public ServletRegistrationBean  createServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new TestServlet());
        Map<String, String> map =new HashMap<>();
        map.put("name","liu");
        map.put("age","34");
        registrationBean.setInitParameters(map);
        registrationBean.setLoadOnStartup(2);
        Collection<String> urlMapping = new LinkedHashSet<>();
        urlMapping.add("/testServlet");
        registrationBean.setUrlMappings(urlMapping);
        registrationBean.setName("testServlet");
        return registrationBean;
    }
    @Bean
    @SystemPropetiesConditional(name = "spring.profiles.active",value="dev1")
    public String testConditiona2(){
        return "testConditiona2";
    }
}
