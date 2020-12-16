package io.sterritt.spring4.design_patterns.creational.builder;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.engine.FastEngine;
import io.sterritt.spring4.design_patterns.creational.domain.engine.HybridEngine;
import io.sterritt.spring4.design_patterns.creational.domain.engine.IEngine;
import io.sterritt.spring4.design_patterns.creational.domain.interior.EAvailableInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.interior.SelectedInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.SelectedPerformanceOptions;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.AutomaticTransmission;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ITransmission;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ManualTransmission;
import io.sterritt.spring4.design_patterns.creational.domain.truck.*;

import static io.sterritt.spring4.design_patterns.creational.builder.EAvailableInteriorPackage.BASE;
import static io.sterritt.spring4.design_patterns.creational.builder.EAvailableInteriorPackage.LUXURY;

public class TruckBuilder implements ITruckBuilder {

    private IEngine engine;
    private ITransmission transmission;
    private IBed bed;
    private EBodyStyle bodyStyle;
    private EAvailablePerformancePackage selectedPerformancePackage;
    private EAvailableInteriorPackage selectedInteriorPackage;
    private SelectedInteriorOptions interiorOptions;
    private SelectedPerformanceOptions performanceOptions;
    private SelectedBedOptions bedOptions;

    @Override
    public ITruck getFinishedTruck() {
        return null;
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
    public void setSelectedBodyStyle(EBodyStyle selectedBodyStyle) {
        this.bodyStyle = selectedBodyStyle;
    }

    @Override
    public void buildMotorTrain() {
        if (bodyStyle.equals(EBodyStyle.FOUR_DOOR)) {
                engine = new FastEngine();

        }
        switch (selectedPerformancePackage) {
            case FAST_BUT_BASIC:
                engine = new FastEngine();
                bed = new ShortBed();
                transmission = new ManualTransmission();
                performanceOptions.setPerformanceTires();
                bedOptions.setBedCover();
            case GREEN:
                engine = new HybridEngine();
                bed = new ShortBed();
                transmission = new AutomaticTransmission();
            case HIGH_PERFORMANCE:
                engine = new FastEngine();
                bed = new LongBed();
                transmission = new AutomaticTransmission();
                performanceOptions.setPerformanceTires();
                performanceOptions.setPerformanceShocks();
                performanceOptions.setPaddleShifters();
        }

    }

    @Override
    public void buildInterior() {
        switch (selectedInteriorPackage) {
            case STANDARD:
                interiorOptions.setElectronicAdjustedSeats();
                interiorOptions.setHeatedSeats();
            case LUXURY:
                interiorOptions.setHeatedSeats();
                interiorOptions.setElectronicAdjustedSeats();
                interiorOptions.setGPSNavigationSystem();
                interiorOptions.setLeatherTrimmedSeats();
        }

        switch (selectedPerformancePackage) {
            case HIGH_PERFORMANCE:
                interiorOptions.setLeatherTrimmedSeats();
                interiorOptions.setGPSNavigationSystem();
                interiorOptions.setHeatedSeats();
                interiorOptions.setElectronicAdjustedSeats();
        }

    }
}
