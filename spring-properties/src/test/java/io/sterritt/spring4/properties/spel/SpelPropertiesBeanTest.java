package io.sterritt.spring4.properties.spel;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpelAppConfig.class)
public class SpelPropertiesBeanTest extends TestCase {

    @Autowired
    SpelPropertiesBean properties;

    @Test
    public void testGetPropertiesFileProperty() {
        assertEquals("first", properties.getPropertiesFileProperty());
    }

    @Test
    public void testGetDefaultProperty() {
        assertEquals("default", properties.getDefaultProperty());
    }

    @Test
    public void testGetSystemProperty() {
        assertEquals(System.getProperty("user.home"), properties.getSystemProperty());
    }

    @Test
    public void testGetEnvironmentProperty() {
        assertEquals(System.getenv("SHELL"), properties.getEnvironmentProperty());
    }
}