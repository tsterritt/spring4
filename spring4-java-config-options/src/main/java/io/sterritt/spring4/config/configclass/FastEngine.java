package io.sterritt.spring4.config.configclass;

import org.springframework.stereotype.Component;

@Component("fastEngine")
public class FastEngine implements EngineOption {

    @Override
    public String getEngineType() {
        return "V8";
    }
}
