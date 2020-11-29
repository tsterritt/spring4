package io.sterritt.spring4.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
@PropertySource("classpath:production.properties")
public class ProductionEnvironmentConfiguration implements ExternalEnvironmentConfiguration {

    @Value("${configuration.property}")
    private String configurationProperty;

    public String getConfiguredProperty() {
        return configurationProperty;
    }
}
