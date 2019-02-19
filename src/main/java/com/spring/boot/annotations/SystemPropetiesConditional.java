package com.spring.boot.annotations;

import com.spring.boot.bean.SystemPropetiesCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Conditional(SystemPropetiesCondition.class)
public @interface SystemPropetiesConditional {
    String name();
    String value();

}
