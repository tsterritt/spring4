package io.sterritt.spring4.design_patterns.creational.builder;

import io.sterritt.spring4.design_patterns.creational.domain.car.ICar;

public interface ICarBuilder extends IVehicleBuilder {
    public ICar getFinishedCar();
}
