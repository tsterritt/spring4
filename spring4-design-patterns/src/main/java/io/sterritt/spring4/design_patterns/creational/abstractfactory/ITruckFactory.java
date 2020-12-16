package io.sterritt.spring4.design_patterns.creational.abstractfactory;

import io.sterritt.spring4.design_patterns.creational.domain.truck.ITruck;

public interface ITruckFactory {
    public ITruck farmTruck();
    public ITruck fastTruck();
}
