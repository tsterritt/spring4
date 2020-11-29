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
public class FastCarTest {

    @Autowired
    ICar fastCar;

    @Test
    public void createFastCar() {
        assertEquals("V8", fastCar.getEngine().getEngineType());
        assertEquals("Manual", fastCar.getTransmission().getTransmissionType());
        assertEquals("Cloth", fastCar.getTrimMaterial().getTrimMaterial());
    }
}