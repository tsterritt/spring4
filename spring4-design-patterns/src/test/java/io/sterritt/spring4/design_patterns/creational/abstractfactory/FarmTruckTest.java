package io.sterritt.spring4.design_patterns.creational.abstractfactory;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.interior.EAvailableInteriorOptions;
import io.sterritt.spring4.design_patterns.creational.domain.performance.EAvailablePerformanceOptions;
import io.sterritt.spring4.design_patterns.creational.domain.truck.EBedOptions;
import io.sterritt.spring4.design_patterns.creational.domain.truck.ITruck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=TruckFactory.class)
public class FarmTruckTest {

    @Autowired
    @Qualifier("farmTruck")
    ITruck farmTruck;

    @Test
    public void createFarmTruck() {
        assertEquals("V8", farmTruck.getEngine().getEngineType());
        assertEquals("Manual", farmTruck.getTransmission().getTransmissionType());
        assertEquals("Long Bed",farmTruck.getBed().getBedType());
        assertEquals(EBodyStyle.FOUR_DOOR,farmTruck.getBodyStyle());
        assertTrue(farmTruck.getInteriorOptions().getOptions().contains(EAvailableInteriorOptions.ELECTRONIC_ADJUSTED_SEATS));
        assertTrue(farmTruck.getInteriorOptions().getOptions().contains(EAvailableInteriorOptions.HEATED_SEATS));
        assertTrue(farmTruck.getPerformanceOptions().getOptions().contains(EAvailablePerformanceOptions.PERFORMANCE_SHOCKS));
        assertTrue(farmTruck.getSelectedBedOptions().getOptions().contains(EBedOptions.TOOL_BOX));
    }
}