package io.sterritt.spring4.properties.environmentclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentClassPropertiesBean {

    @Autowired
    private Environment environment;

    public String getPropertiesFileProperty() {
        return environment.getProperty("first.property");
    }

    public String getDefaultProperty() {
        return environment.getProperty("default.property") == null ? "default" : environment.getProperty("default.property");
    }

    public String getSystemProperty() {
        return environment.getProperty("user.home");
    }


    public String getEnvironmentProperty() {
        return environment.getProperty("SHELL");
    }
}
