package io.sterritt.spring4.design_patterns.creational.domain.transmission;

public class ManualTransmission implements ITransmission {
    @Override
    public String getTransmissionType() {
        return "Manual";
    }
}
