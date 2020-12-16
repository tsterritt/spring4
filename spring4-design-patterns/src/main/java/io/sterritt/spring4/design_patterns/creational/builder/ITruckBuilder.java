package io.sterritt.spring4.design_patterns.creational.builder;

import io.sterritt.spring4.design_patterns.creational.domain.truck.ITruck;

public interface ITruckBuilder extends IVehicleBuilder {
    public ITruck getFinishedTruck();
}
