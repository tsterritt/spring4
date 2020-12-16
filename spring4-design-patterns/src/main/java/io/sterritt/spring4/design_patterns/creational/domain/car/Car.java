package io.sterritt.spring4.design_patterns.creational.domain.car;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.engine.IEngine;
import io.sterritt.spring4.design_patterns.creational.domain.interior.SelectedInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.SelectedPerformanceOptions;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ITransmission;

public class Car implements ICar {

    private final IEngine engine;
    private final ITransmission transmission;
    private final EBodyStyle bodyStyle;
    private final SelectedPerformanceOptions performanceOptions;
    private final SelectedInteriorOptions interiorOptions;

    public Car(IEngine engine, ITransmission transmission, EBodyStyle bodyStyle, SelectedInteriorOptions interiorOptions, SelectedPerformanceOptions performanceOptions) {
        this.engine = engine;
        this.transmission=transmission;
        this.bodyStyle = bodyStyle;
        this.interiorOptions = interiorOptions;
        this.performanceOptions = performanceOptions;
    }

    @Override
    public IEngine getEngine() {
        return engine;
    }

    @Override
    public ITransmission getTransmission() {
        return transmission;
    }

    @Override
    public SelectedInteriorOptions getInteriorOptions() {
        return interiorOptions;
    }

    @Override
    public SelectedPerformanceOptions getPerformanceOptions() {
        return performanceOptions;
    }

    @Override
    public EBodyStyle getBodyStyle() {
        return bodyStyle;
    }
}
