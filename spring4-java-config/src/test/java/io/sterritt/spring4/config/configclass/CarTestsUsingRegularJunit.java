package io.sterritt.spring4.config.configclass;

import io.sterritt.spring4.config.configclass.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CarTestsUsingRegularJunit {

    private Car car;

    @Before
    public void setUp() {
        //since trim package is only a constructor, then every test instance
        //need to have a trim package added
        LuxuryTrimPackage trimPackage = new LuxuryTrimPackage();
        FastEngine engine = new FastEngine();
        car = new Car(trimPackage, engine);
    }

    @Test
    public void testTrimPackage() {
        assertEquals("Leather",car.getTrimPackage().getSeatOption());
    }

    @Test
    public void testEngineOption() {
        assertEquals("V8",car.getEngineOption().getEngineType());
    }

    @Test
    public void testNavigationSystemOption() {
        car.setNavigationSystemOption(new GPSEnabledNavigationOption());
        assertEquals("GPS",car.getNavigationSystemOption().getNavigationSystemOption());
    }
}
