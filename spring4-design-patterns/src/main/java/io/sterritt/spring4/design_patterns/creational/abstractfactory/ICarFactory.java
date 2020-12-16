package io.sterritt.spring4.design_patterns.creational.abstractfactory;

import io.sterritt.spring4.design_patterns.creational.domain.car.ICar;

public interface ICarFactory {
    public ICar fastCar();
    public ICar luxuryHybrid();
}
