package creational.abstractfactory.truck;

import creational.abstractfactory.engines.IEngine;
import creational.abstractfactory.transmissions.ITransmission;
import creational.abstractfactory.trimoptions.ITrimMaterial;

public class Truck implements ITruck {

    private IEngine engine;
    private ITrimMaterial trimMaterial;
    private IBed bed;
    private ITransmission transmission;

    public Truck(IEngine engine, ITrimMaterial trimMaterial, IBed bed, ITransmission transmission){
        this.bed=bed;
        this.engine=engine;
        this.trimMaterial=trimMaterial;
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

    @Override
    public IBed getBed() {
        return bed;
    }
}
