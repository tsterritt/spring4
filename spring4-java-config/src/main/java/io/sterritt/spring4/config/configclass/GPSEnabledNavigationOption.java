package io.sterritt.spring4.config.configclass;

import org.springframework.stereotype.Component;

@Component
public class GPSEnabledNavigationOption implements NavigationSystemOption {

    @Override
    public String getNavigationSystemOption() {
        return "GPS";
    }
}
