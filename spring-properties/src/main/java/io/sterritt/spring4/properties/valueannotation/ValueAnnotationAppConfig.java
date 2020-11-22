package io.sterritt.spring4.properties.valueannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan
@PropertySource("classpath:file.properties")
public class ValueAnnotationAppConfig {


    /**
     * Need this method in config to use @Value notations
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer configurePropertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer pc = new PropertySourcesPlaceholderConfigurer();
        return pc;
    }
}
