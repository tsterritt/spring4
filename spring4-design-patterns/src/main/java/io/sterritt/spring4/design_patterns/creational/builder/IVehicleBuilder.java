package io.sterritt.spring4.design_patterns.creational.builder;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;

public interface IVehicleBuilder {
    public void setSelectedPerformancePackage(EAvailablePerformancePackage selectedPerformancePackage);
    public void setSelectedInteriorPackage(EAvailableInteriorPackage selectedInteriorPackage);
    public void setSelectedBodyStyle(EBodyStyle selectedBodyStyle);
    public void buildMotorTrain();
    public void buildInterior();
}
