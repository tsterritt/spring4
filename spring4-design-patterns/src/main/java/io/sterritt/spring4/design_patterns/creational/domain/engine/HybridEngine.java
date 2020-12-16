package io.sterritt.spring4.design_patterns.creational.domain.engine;

public class HybridEngine implements IEngine {
    @Override
    public String getEngineType() {
        return "Hybrid";
    }
}
