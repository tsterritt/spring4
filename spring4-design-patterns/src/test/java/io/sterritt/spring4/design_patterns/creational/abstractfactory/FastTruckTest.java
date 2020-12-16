package io.sterritt.spring4.design_patterns.creational.abstractfactory;

import io.sterritt.spring4.design_patterns.creational.domain.body.EBodyStyle;
import io.sterritt.spring4.design_patterns.creational.domain.truck.EBedOptions;
import io.sterritt.spring4.design_patterns.creational.domain.truck.ITruck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=TruckFactory.class)
public class FastTruckTest {

    @Autowired
    ITruck fastTruck;

    @Test
    public void createFastTruck() {
        assertEquals("V8", fastTruck.getEngine().getEngineType());
        assertEquals("Manual", fastTruck.getTransmission().getTransmissionType());
        assertEquals(EBodyStyle.TWO_DOOR,fastTruck.getBodyStyle());
        assertEquals("Short Bed",fastTruck.getBed().getBedType());
        assertTrue(fastTruck.getSelectedBedOptions().getOptions().contains(EBedOptions.BED_COVER));
        assertEquals(fastTruck.getInteriorOptions().getOptions().size(),0);
    }
}