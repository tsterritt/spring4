package io.sterritt.spring4.config.configclass;

import io.sterritt.spring4.config.configclass.Car;
import io.sterritt.spring4.config.configclass.EngineOption;
import io.sterritt.spring4.config.configclass.NavigationSystemOption;
import io.sterritt.spring4.config.configclass.TrimPackage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Kind of a pointless test since the Car class can be easily testing with regular Unit tests. But, showing how to mock the
 * components objects of car in test cases anyway.
 */
@RunWith(MockitoJUnitRunner.class)
public class CarTestsUsingMocks {

    @Mock
    NavigationSystemOption navigationSystemOption;

    @Mock
    TrimPackage trimPackage;

    @Mock
    EngineOption engineOption;

    @InjectMocks
    Car car = new Car(trimPackage ,engineOption);

    @Test
    public void testNavigationSystemOption() {
        Mockito.when(navigationSystemOption.getNavigationSystemOption()).thenReturn("testNavigationOption");
        assertEquals("testNavigationOption",car.getNavigationSystemOption().getNavigationSystemOption());
    }


    @Test
    public void testTrimPackageOption() {
        Mockito.when(car.getTrimPackage().getSeatOption()).thenReturn("testSeatOption");
        assertEquals("testSeatOption",car.getTrimPackage().getSeatOption());
    }

    @Test
    public void testEngineOption() {
        Mockito.when(engineOption.getEngineType()).thenReturn("testEngineType");
        assertEquals("testEngineType",car.getEngineOption().getEngineType());
    }
}
