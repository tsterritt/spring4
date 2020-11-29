package creational.abstractfactory.transmissions;

public class ManualTransmission implements ITransmission {
    @Override
    public String getTransmissionType() {
        return "Manual";
    }
}
