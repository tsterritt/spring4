package io.sterritt.spring4.properties.environmentclass;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@PropertySource("classpath:file.properties")
public class EnvironmentClassAppConfig {

}
