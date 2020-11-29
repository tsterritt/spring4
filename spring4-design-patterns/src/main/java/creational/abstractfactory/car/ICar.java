package creational.abstractfactory.car;

import creational.abstractfactory.engines.IEngine;
import creational.abstractfactory.transmissions.ITransmission;
import creational.abstractfactory.trimoptions.ITrimMaterial;

public interface ICar {
    IEngine getEngine();

    ITrimMaterial getTrimMaterial();

    ITransmission getTransmission();
}
