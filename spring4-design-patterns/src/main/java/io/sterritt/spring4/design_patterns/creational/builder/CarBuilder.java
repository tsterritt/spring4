package io.sterritt.spring4.design_patterns.creational.builder;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.car.Car;
import io.sterritt.spring4.design_patterns.creational.domain.car.ICar;
import io.sterritt.spring4.design_patterns.creational.domain.engine.FastEngine;
import io.sterritt.spring4.design_patterns.creational.domain.engine.HybridEngine;
import io.sterritt.spring4.design_patterns.creational.domain.engine.IEngine;
import io.sterritt.spring4.design_patterns.creational.domain.interior.SelectedInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.SelectedPerformanceOptions;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.AutomaticTransmission;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ITransmission;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ManualTransmission;
import org.springframework.stereotype.Component;

@Component
public class CarBuilder implements ICarBuilder {

    private IEngine engine;
    private ITransmission transmission;
    private EBodyStyle bodyStyle;
    private EAvailablePerformancePackage selectedPerformancePackage;
    private EAvailableInteriorPackage selectedInteriorPackage;
    private SelectedInteriorOptions interiorOptions;
    private SelectedPerformanceOptions performanceOptions;

    public CarBuilder() {
        interiorOptions = new SelectedInteriorOptions();
        performanceOptions = new SelectedPerformanceOptions();
    }

    @Override
    public ICar getFinishedCar() {
        return new Car(engine, transmission, bodyStyle, interiorOptions, performanceOptions);
    }

    @Override
    public void setSelectedPerformancePackage(EAvailablePerformancePackage selectedPerformancePackage) {
        this.selectedPerformancePackage = selectedPerformancePackage;
    }

    @Override
    public void setSelectedInteriorPackage(EAvailableInteriorPackage selectedInteriorPackage) {
        this.selectedInteriorPackage = selectedInteriorPackage;
    }

    @Override
    public void setSelectedBodyStyle(EBodyStyle bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    @Override
    public void buildMotorTrain() {
        switch (selectedPerformancePackage) {
            case GREEN:
                engine = new HybridEngine();
                transmission = new AutomaticTransmission();
            case FAST_BUT_BASIC:
                performanceOptions.setPerformanceTires();
                performanceOptions.setPerformanceShocks();
                transmission = new AutomaticTransmission();
                engine = new FastEngine();
            case HIGH_PERFORMANCE:
                performanceOptions.setPaddleShifters();
                performanceOptions.setPerformanceShocks();
                performanceOptions.setPerformanceTires();
                engine = new FastEngine();
                transmission = new ManualTransmission();
        }
    }

    @Override
    public void buildInterior() {
        switch (selectedInteriorPackage) {
            case STANDARD:
                interiorOptions.setElectronicAdjustedSeats();
                interiorOptions.setHeatedSeats();
            case LUXURY:
                interiorOptions.setElectronicAdjustedSeats();
                interiorOptions.setGPSNavigationSystem();
                interiorOptions.setLeatherTrimmedSeats();
                performanceOptions.setPaddleShifters();
        }

        if (bodyStyle.equals(EBodyStyle.HATCHBACK)) {
            interiorOptions.setCargoAreaCover();
        }

        if (engine.getEngineType().equals("Hybrid")) {
            interiorOptions.setGPSNavigationSystem();
        }
    }
}
