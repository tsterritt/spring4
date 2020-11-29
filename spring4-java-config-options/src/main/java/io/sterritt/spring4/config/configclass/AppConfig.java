package io.sterritt.spring4.config.configclass;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    /**
     * Configure a Luxury Hybrid Car
     * @return Car
     */
    @Bean
    public Car hybridLuxuryCar(@Qualifier("luxuryTrimPackage") TrimPackage trimPackage, @Qualifier("hybridEngineOption") EngineOption engineOption, @Qualifier("gpsNavigationOption") NavigationSystemOption navigationSystemOption) {
        Car c = new Car(trimPackage, engineOption);
        c.setNavigationSystemOption(new GPSEnabledNavigationOption());
        return c;
    }

    @Bean
    public TrimPackage luxuryTrimPackage() {
        return new LuxuryTrimPackage();
    }

    @Bean
    public EngineOption hybridEngineOption() {
        return new HybridEngineOption();
    }

    @Bean
    public NavigationSystemOption gpsNavigationOption() {
        return new GPSEnabledNavigationOption();
    }
}
