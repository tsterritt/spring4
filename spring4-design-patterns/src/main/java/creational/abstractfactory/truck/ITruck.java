package creational.abstractfactory.truck;

import creational.abstractfactory.engines.IEngine;
import creational.abstractfactory.transmissions.ITransmission;
import creational.abstractfactory.trimoptions.ITrimMaterial;

public interface ITruck {
    IEngine getEngine();

    ITrimMaterial getTrimMaterial();

    ITransmission getTransmission();

    IBed getBed();
}
