package io.sterritt.spring4.design_patterns.creational.abstractfactory;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.engine.FastEngine;
import io.sterritt.spring4.design_patterns.creational.domain.interior.SelectedInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.SelectedPerformanceOptions;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ManualTransmission;
import io.sterritt.spring4.design_patterns.creational.domain.truck.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TruckFactory implements ITruckFactory {

    @Override
    @Bean
    public ITruck farmTruck() {
        ManualTransmission transmission = new ManualTransmission();
        FastEngine engine = new FastEngine();
        LongBed bed = new LongBed();
        EBodyStyle bodyStyle = EBodyStyle.FOUR_DOOR;

        SelectedInteriorOptions interiorOptions = new SelectedInteriorOptions();
        interiorOptions.setElectronicAdjustedSeats();
        interiorOptions.setHeatedSeats();

        SelectedPerformanceOptions performanceOptions = new SelectedPerformanceOptions();
        performanceOptions.setPerformanceShocks();

        SelectedBedOptions bedOptions = new SelectedBedOptions();
        bedOptions.setToolBox();

        return new Truck(engine, transmission, bodyStyle, bed, bedOptions, interiorOptions, performanceOptions);
    }

    @Override
    @Bean
    public ITruck fastTruck() {
        ManualTransmission transmission = new ManualTransmission();
        FastEngine engine = new FastEngine();
        ShortBed bed = new ShortBed();
        EBodyStyle bodyStyle = EBodyStyle.TWO_DOOR;

        SelectedInteriorOptions interiorOptions = new SelectedInteriorOptions();

        SelectedPerformanceOptions performanceOptions = new SelectedPerformanceOptions();
        performanceOptions.setPerformanceShocks();
        performanceOptions.setPerformanceTires();

        SelectedBedOptions bedOptions = new SelectedBedOptions();
        bedOptions.setBedCover();

        return new Truck(engine, transmission, bodyStyle, bed, bedOptions, interiorOptions, performanceOptions);
    }
}
