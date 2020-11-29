package io.sterritt.spring4.properties.valueannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

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

    @Value("${array.property}")
    private String[] arrayProperty;

    @Value("#{${list.property}}")
    private List<String> listProperty;


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

    public String[] getArrayProperty() {
        return arrayProperty;
    }

    public List getListProperty() {
        return listProperty;
    }
}
