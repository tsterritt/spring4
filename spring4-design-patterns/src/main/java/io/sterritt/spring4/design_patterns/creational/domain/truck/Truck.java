package io.sterritt.spring4.design_patterns.creational.domain.truck;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.engine.IEngine;
import io.sterritt.spring4.design_patterns.creational.domain.interior.SelectedInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.SelectedPerformanceOptions;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ITransmission;

public class Truck implements ITruck {

    private IEngine engine;
    private IBed bed;
    private ITransmission transmission;
    private SelectedPerformanceOptions performanceOptions;
    private SelectedInteriorOptions interiorOptions;
    private SelectedBedOptions bedOptions;
    private EBodyStyle bodyStyle;

    public Truck(IEngine engine, ITransmission transmission, EBodyStyle bodyStyle, IBed bed, SelectedBedOptions bedOptions, SelectedInteriorOptions interiorOptions, SelectedPerformanceOptions performanceOptions) {
        this.engine = engine;
        this.transmission = transmission;
        this.bed = bed;
        this.bedOptions = bedOptions;
        this.interiorOptions = interiorOptions;
        this.performanceOptions = performanceOptions;
        this.bodyStyle = bodyStyle;
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
    public EBodyStyle getBodyStyle() {
        return bodyStyle;
    }

    @Override
    public IBed getBed() {
        return bed;
    }

    @Override
    public SelectedBedOptions getSelectedBedOptions() {
        return bedOptions;
    }

    @Override
    public SelectedInteriorOptions getInteriorOptions() {
        return interiorOptions;
    }

    @Override
    public SelectedPerformanceOptions getPerformanceOptions() {
        return performanceOptions;
    }
}
