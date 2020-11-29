package io.sterritt.spring4.config.componentscan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("gpsNavigationSystem")
public class GPSEnabledNavigationOption implements NavigationSystemOption {

    @Override
    public String getNavigationSystemOption() {
        return "GPS";
    }
}
