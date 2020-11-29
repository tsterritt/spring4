package creational.abstractfactory.transmissions;

public class AutomaticTransmission implements ITransmission {
    @Override
    public String getTransmissionType() {
        return "Automatic";
    }
}
