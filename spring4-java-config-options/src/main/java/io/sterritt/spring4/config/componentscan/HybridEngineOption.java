package io.sterritt.spring4.config.componentscan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("hybridEngine")
public class HybridEngineOption implements EngineOption {

    @Override
    public String getEngineType() {
        return "Hybrid";
    }
}
