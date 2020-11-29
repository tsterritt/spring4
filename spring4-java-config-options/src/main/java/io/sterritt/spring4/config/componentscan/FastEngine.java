package io.sterritt.spring4.config.componentscan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fastEngine")
public class FastEngine implements EngineOption {

    @Override
    public String getEngineType() {
        return "V8";
    }
}
