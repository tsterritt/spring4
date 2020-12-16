package io.sterritt.spring4.design_patterns.creational.domain.car;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.engine.IEngine;
import io.sterritt.spring4.design_patterns.creational.domain.interior.SelectedInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.SelectedPerformanceOptions;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ITransmission;

public interface ICar {
    IEngine getEngine();

    ITransmission getTransmission();

    SelectedInteriorOptions getInteriorOptions();

    SelectedPerformanceOptions getPerformanceOptions();

    EBodyStyle getBodyStyle();
}
