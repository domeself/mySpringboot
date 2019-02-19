package com.spring.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

    @Test
    public void contextLoads() {
        AnnotationConfigServletWebServerApplicationContext context =new AnnotationConfigServletWebServerApplicationContext();
        context.refresh();
    }

}
