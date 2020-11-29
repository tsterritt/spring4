package creational.abstractfactory.car;

import creational.abstractfactory.car.ICar;

public interface ICarFactory {
    public ICar fastCar();
    public ICar luxuryHybrid();
}
