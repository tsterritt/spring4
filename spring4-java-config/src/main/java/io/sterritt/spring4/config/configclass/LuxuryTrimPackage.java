package io.sterritt.spring4.config.configclass;


public class LuxuryTrimPackage implements TrimPackage {

    @Override
    public String getSeatOption() {
        return "Leather";
    }
}

