package com.spring.boot.annotations;

import com.spring.boot.bean.CreateConfigBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

@Configuration
public class EnabelTestImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{CreateConfigBean.class.getName()};
    }
}
