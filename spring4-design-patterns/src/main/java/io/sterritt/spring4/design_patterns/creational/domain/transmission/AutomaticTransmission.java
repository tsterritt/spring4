package io.sterritt.spring4.design_patterns.creational.domain.transmission;

public class AutomaticTransmission implements ITransmission {
    @Override
    public String getTransmissionType() {
        return "Automatic";
    }
}
