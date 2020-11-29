package io.sterritt.spring4.profiles.custom;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan
public class ProfilesAppConfig {

    /**
     * Enable using @value annotation in beans
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer configurePropertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer pc = new PropertySourcesPlaceholderConfigurer();
        return pc;
    }
}
