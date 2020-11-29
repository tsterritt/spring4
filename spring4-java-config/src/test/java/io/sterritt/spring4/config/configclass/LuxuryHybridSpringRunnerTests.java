package io.sterritt.spring4.config.configclass;

import io.sterritt.spring4.config.configclass.AppConfig;
import io.sterritt.spring4.config.configclass.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * The car class uses autowiring to setup the config for trim package, navigivation system, and engine
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class LuxuryHybridSpringRunnerTests {

    @Autowired
    private Car hybridLuxuryCar;

    @Test
    public void testTrimPackage() throws Exception {
        assertEquals("Leather", hybridLuxuryCar.getTrimPackage().getSeatOption());
    }

    @Test
    public void testEngine() throws Exception {
        assertEquals("Hybrid", hybridLuxuryCar.getEngineOption().getEngineType());
    }

    @Test
    public void testNavigationSystem() throws Exception {
        assertEquals("GPS", hybridLuxuryCar.getNavigationSystemOption().getNavigationSystemOption());
    }
}
