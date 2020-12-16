package io.sterritt.spring4.design_patterns.creational.abstractfactory;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.car.Car;
import io.sterritt.spring4.design_patterns.creational.domain.car.ICar;
import io.sterritt.spring4.design_patterns.creational.domain.engine.FastEngine;
import io.sterritt.spring4.design_patterns.creational.domain.engine.HybridEngine;
import io.sterritt.spring4.design_patterns.creational.domain.interior.SelectedInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.SelectedPerformanceOptions;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.AutomaticTransmission;
import io.sterritt.spring4.design_patterns.creational.domain.transmission.ManualTransmission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarFactory implements ICarFactory {

    @Override
    @Bean
    public ICar luxuryHybrid() {
        AutomaticTransmission transmission = new AutomaticTransmission();
        HybridEngine engine = new HybridEngine();
        EBodyStyle bodyStyle = EBodyStyle.FOUR_DOOR;

        SelectedInteriorOptions interiorOptions = new SelectedInteriorOptions();
        interiorOptions.setLeatherTrimmedSeats();
        interiorOptions.setElectronicAdjustedSeats();
        interiorOptions.setHeatedSeats();
        interiorOptions.setGPSNavigationSystem();

        SelectedPerformanceOptions performanceOptions = new SelectedPerformanceOptions();

        return new Car(engine, transmission, bodyStyle, interiorOptions, performanceOptions);
    }

    @Override
    @Bean
    public ICar fastCar() {
        ManualTransmission transmission = new ManualTransmission();
        FastEngine engine = new FastEngine();
        EBodyStyle bodyStyle = EBodyStyle.HATCHBACK;

        SelectedInteriorOptions interiorOptions = new SelectedInteriorOptions();
        interiorOptions.setCargoAreaCover();

        SelectedPerformanceOptions performanceOptions = new SelectedPerformanceOptions();
        performanceOptions.setPaddleShifters();
        performanceOptions.setPerformanceShocks();
        performanceOptions.setPerformanceTires();

        return new Car(engine, transmission, bodyStyle, interiorOptions, performanceOptions);
    }
}
