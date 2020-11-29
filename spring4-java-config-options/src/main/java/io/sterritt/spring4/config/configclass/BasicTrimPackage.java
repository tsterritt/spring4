package io.sterritt.spring4.config.configclass;

public class BasicTrimPackage implements TrimPackage {

    @Override
    public String getSeatOption() {
        return "Cloth";
    }
}
