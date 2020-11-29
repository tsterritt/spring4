package io.sterritt.spring4.config.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("hybridLuxuryCar")
public class HybridLuxuryCar extends Car {

    @Autowired
    public HybridLuxuryCar(@Qualifier("luxuryTrimPackage") TrimPackage trimPackage, @Qualifier("hybridEngine") EngineOption engineOption, @Qualifier("gpsNavigationSystem") NavigationSystemOption navigationSystemOption) {
        super(trimPackage, engineOption);
        super.setNavigationSystemOption(navigationSystemOption);
    }
}
