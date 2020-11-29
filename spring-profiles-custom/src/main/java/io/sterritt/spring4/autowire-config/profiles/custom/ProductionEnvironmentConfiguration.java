package io.sterritt.spring4.profiles.custom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
@PropertySource("classpath:production.properties")
public class ProductionEnvironmentConfiguration implements io.sterritt.spring4.profiles.custom.ExternalEnvironmentConfiguration {

    @Value("${configuration.property}")
    private String configurationProperty;

    public String getConfiguredProperty() {
        return configurationProperty;
    }
}
