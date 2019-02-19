package com.spring.boot.bean;

import com.spring.boot.annotations.SystemPropetiesConditional;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class SystemPropetiesCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(SystemPropetiesConditional.class.getName());
        String name = System.getenv((String) annotationAttributes.get("name"));
        String value = (String)annotationAttributes.get("value");
        return name.equals(value);

    }
}
