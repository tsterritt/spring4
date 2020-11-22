package io.sterritt.spring4.properties.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelPropertiesBean {

    //kind of pointless example, but SPEL allows setting defaults, parsing lists, etc
    @Value("#{'${first.property}'}")
    private String propertiesFileProperty;


    @Value("#{'${default.property:default}'}")
    private String defaultProperty;

    @Value("#{systemProperties['user.home']}")
    private String systemProperty;

    @Value("#{environment.SHELL}")
    private String environmentProperty;

    public SpelPropertiesBean() {
    }

    public String getPropertiesFileProperty() {
        return propertiesFileProperty;
    }

    public String getDefaultProperty() {
        return defaultProperty;
    }

    public String getSystemProperty() {
        return systemProperty;
    }

    public String getEnvironmentProperty() {
        return environmentProperty;
    }
}
