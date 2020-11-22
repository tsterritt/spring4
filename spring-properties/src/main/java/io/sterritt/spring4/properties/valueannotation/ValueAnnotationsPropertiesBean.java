package io.sterritt.spring4.properties.valueannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationsPropertiesBean {

    @Value("${first.property}")
    private String firstProperty;

    @Value("${third.property:default}")
    private String defaultProperty;

    @Value("${user.home}")
    private String systemProperty;

    @Value("#{environment.SHELL}")
    private String environmentVariable;


    public String getPropertiesFileProperty() {
        return firstProperty;
    }

    public String getDefaultProperty() {
        return defaultProperty;
    }

    public String getSystemProperty() {
        return systemProperty;
    }

    public String getEnvironmentVariable() {
        return this.environmentVariable;
    }
}
