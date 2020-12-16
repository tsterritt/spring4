package io.sterritt.spring4.design_patterns.creational.abstractfactory;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.car.ICar;
import io.sterritt.spring4.design_patterns.creational.domain.interior.EAvailableInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.EAvailablePerformanceOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= CarFactory.class)
public class HybridCarTest {

    @Autowired
    ICar luxuryHybrid;

    @Test
    public void createHybridLuxuryCar() {
        assertEquals("Hybrid", luxuryHybrid.getEngine().getEngineType());
        assertEquals("Automatic", luxuryHybrid.getTransmission().getTransmissionType());
        assertEquals(EBodyStyle.FOUR_DOOR, luxuryHybrid.getBodyStyle());
        assertTrue(luxuryHybrid.getInteriorOptions().getOptions().contains(EAvailableInteriorOptions.HEATED_SEATS));
        assertTrue(luxuryHybrid.getInteriorOptions().getOptions().contains(EAvailableInteriorOptions.ELECTRONIC_ADJUSTED_SEATS));
        assertTrue(luxuryHybrid.getInteriorOptions().getOptions().contains(EAvailableInteriorOptions.GPS_NAV_SYSTEM));
        assertTrue(luxuryHybrid.getInteriorOptions().getOptions().contains(EAvailableInteriorOptions.LEATHER_TRIM));
    }
}