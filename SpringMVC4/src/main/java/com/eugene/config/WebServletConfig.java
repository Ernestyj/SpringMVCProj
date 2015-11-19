package com.eugene.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by DCLab on 11/19/2015.
 */
@Configuration
@EnableWebMvc   //Enable Spring MVC
@ComponentScan("com.eugene")    //Enable component-scanning
public class WebServletConfig extends WebMvcConfigurerAdapter {

    @Bean   //configure a JSP view resolver
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    @Override   //Configure static content handling
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        // asking DispatcherServlet to forward requests for static resources to
        // the servlet container¡¯s default servlet and not to try to
        // handle them itself.
        configurer.enable();
    }
}
