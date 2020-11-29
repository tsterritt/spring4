package creational.abstractfactory;

import creational.abstractfactory.truck.ITruck;
import creational.abstractfactory.truck.TruckFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= TruckFactory.class)
public class FarmTruckTest {

    @Autowired
    @Qualifier("farmTruck")
    ITruck farmTruck;

    @Test
    public void createFarmTruck() {
        assertEquals("V8", farmTruck.getEngine().getEngineType());
        assertEquals("Manual", farmTruck.getTransmission().getTransmissionType());
        assertEquals("Cloth", farmTruck.getTrimMaterial().getTrimMaterial());
        assertEquals("Long Bed",farmTruck.getBed().getBedType());
    }
}