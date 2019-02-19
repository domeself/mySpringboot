package com.spring.boot.configuration;

import com.spring.boot.annotations.EnableTest;
import com.spring.boot.annotations.SystemPropetiesConditional;


@EnableTest
@SystemPropetiesConditional(name="spring.profiles.active",value = "dev")
public class TestAutoConfiguration {
}
