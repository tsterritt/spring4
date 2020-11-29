package io.sterritt.spring4.config.componentscan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("basicTrimPackage")
public class BasicTrimPackage implements TrimPackage {

    @Override
    public String getSeatOption() {
        return "Cloth";
    }
}
