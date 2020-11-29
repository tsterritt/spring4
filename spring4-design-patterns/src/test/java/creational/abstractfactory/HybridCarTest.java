package creational.abstractfactory;

import creational.abstractfactory.car.CarFactory;
import creational.abstractfactory.car.ICar;
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
        assertEquals("Leather", luxuryHybrid.getTrimMaterial().getTrimMaterial());
    }
}