package com.eugene.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by DCLab on 11/19/2015.
 */
@Configuration
@ComponentScan(basePackages = { "com.eugene" },
    excludeFilters = { @ComponentScan.Filter(value = EnableWebMvc.class,
            type = FilterType.ANNOTATION) })
public class RootConfig {

}
