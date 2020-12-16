package io.sterritt.spring4.design_patterns.creational.domain.truck;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.engine.IEngine;
import io.sterritt.spring4.design_patterns.creational.domain.interior.SelectedInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.SelectedPerformanceOptions;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ITransmission;

public interface ITruck {
    public IEngine getEngine();
    public ITransmission getTransmission();
    public EBodyStyle getBodyStyle();
    public IBed getBed();
    public SelectedBedOptions getSelectedBedOptions();
    public SelectedInteriorOptions getInteriorOptions();
    public SelectedPerformanceOptions getPerformanceOptions();

}
