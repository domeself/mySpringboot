package com.spring.boot.annotations;

import com.spring.boot.bean.CreateConfigBean;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(CreateConfigBean.class)
public @interface EnableTest {
}
