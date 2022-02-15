package com.nordic.rover.modular.base.config.inspector;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


@Component
public class ApplicationContextInspector implements ApplicationContextAware {

    private ConfigurableApplicationContext configurableApplicationContext;

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        this.configurableApplicationContext = (ConfigurableApplicationContext) applicationContext;
    }

    public ConfigurableApplicationContext extract() {
        return this.configurableApplicationContext;
    }

    public void destroy() {
        System.exit(SpringApplication.exit(this.configurableApplicationContext));
    }
}
