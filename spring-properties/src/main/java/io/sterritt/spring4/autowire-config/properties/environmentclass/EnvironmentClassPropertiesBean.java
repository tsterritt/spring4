package io.sterritt.spring4.properties.environmentclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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


    public String[] getArrayProperty() {
        return environment.getProperty("array.property",String[].class);
    }

    public List<String> getListProperty() {
        //environment expects a different property format for lists than spel and @value. The format is
        //the same as specifying properties as arrays
        return environment.getProperty("array.property", ArrayList.class);
    }
}
