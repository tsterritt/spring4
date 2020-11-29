package io.sterritt.spring4.config.componentscan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTestsUsingRegularJunit {

    private HybridLuxuryCar car;

    @Before
    public void setUp() {
        LuxuryTrimPackage trimPackage = new LuxuryTrimPackage();
        FastEngine engine = new FastEngine();
        GPSEnabledNavigationOption navigationOption = new GPSEnabledNavigationOption();
        car = new HybridLuxuryCar(trimPackage, engine, navigationOption);
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
