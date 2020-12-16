package io.sterritt.spring4.design_patterns.creational.domain.engine;

public class FastEngine implements IEngine {
    @Override
    public String getEngineType() {
        return "V8";
    }
}
