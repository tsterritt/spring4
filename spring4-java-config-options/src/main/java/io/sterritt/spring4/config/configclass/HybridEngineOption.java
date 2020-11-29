package io.sterritt.spring4.config.configclass;

import org.springframework.stereotype.Component;

@Component("hybridEngine")
public class HybridEngineOption implements EngineOption {

    @Override
    public String getEngineType() {
        return "Hybrid";
    }
}
