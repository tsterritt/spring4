package io.sterritt.spring4.properties.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

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

    @Value("#{'${array.property}'}")
    private String[] stringArrayProperty;

    @Value("#{${list.property}}")
    private List listProperty;

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

    public String[] getStringArrayProperty() {
        return stringArrayProperty;
    }

    public List getListProperty() {
        return listProperty;
    }
}
