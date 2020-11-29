package creational.abstractfactory.engines;

public class FastEngine implements IEngine {
    @Override
    public String getEngineType() {
        return "V8";
    }
}
