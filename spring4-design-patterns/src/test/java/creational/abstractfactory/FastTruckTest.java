package creational.abstractfactory;

import creational.abstractfactory.truck.ITruck;
import creational.abstractfactory.truck.ITruckFactory;
import creational.abstractfactory.truck.TruckFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= TruckFactory.class)
public class FastTruckTest {

    @Autowired
    ITruck fastTruck;

    @Test
    public void createFarmTruck() {
        assertEquals("V8", fastTruck.getEngine().getEngineType());
        assertEquals("Automatic", fastTruck.getTransmission().getTransmissionType());
        assertEquals("Leather", fastTruck.getTrimMaterial().getTrimMaterial());
        assertEquals("Short Bed",fastTruck.getBed().getBedType());
    }
}