package creational.abstractfactory.engines;

public class HybridEngine implements IEngine {
    @Override
    public String getEngineType() {
        return "Hybrid";
    }
}
