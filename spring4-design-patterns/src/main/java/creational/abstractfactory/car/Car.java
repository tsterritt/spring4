package creational.abstractfactory.car;

import creational.abstractfactory.engines.IEngine;
import creational.abstractfactory.transmissions.ITransmission;
import creational.abstractfactory.trimoptions.ITrimMaterial;

public class Car implements ICar {

    private IEngine engine;
    private ITrimMaterial trimMaterial;
    private ITransmission transmission;

    public Car(IEngine engine, ITransmission transmission, ITrimMaterial trimMaterial) {
        this.trimMaterial= trimMaterial;
        this.engine = engine;
        this.transmission=transmission;
    }


    @Override
    public IEngine getEngine() {
        return engine;
    }

    @Override
    public ITrimMaterial getTrimMaterial() {
        return trimMaterial;
    }

    @Override
    public ITransmission getTransmission() {
        return transmission;
    }
}
