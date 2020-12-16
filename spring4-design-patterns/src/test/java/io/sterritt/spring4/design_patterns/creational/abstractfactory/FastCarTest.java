package io.sterritt.spring4.design_patterns.creational.abstractfactory;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.car.ICar;
import io.sterritt.spring4.design_patterns.creational.domain.interior.EAvailableInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.EAvailablePerformanceOptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= CarFactory.class)
public class FastCarTest {

    @Autowired
    ICar fastCar;

    @Test
    public void createFastCar() {
        assertEquals("V8", fastCar.getEngine().getEngineType());
        assertEquals("Manual", fastCar.getTransmission().getTransmissionType());
        assertEquals(EBodyStyle.HATCHBACK, fastCar.getBodyStyle());
        assertTrue(fastCar.getPerformanceOptions().getOptions().contains(EAvailablePerformanceOptions.PERFORMANCE_SHOCKS));
        assertTrue(fastCar.getPerformanceOptions().getOptions().contains(EAvailablePerformanceOptions.PADDLE_SHIFTERS));
        assertTrue(fastCar.getPerformanceOptions().getOptions().contains(EAvailablePerformanceOptions.PERFORMANCE_TIRES));
        assertTrue(fastCar.getInteriorOptions().getOptions().contains(EAvailableInteriorOptions.CARGO_AREA_COVER));
    }
}