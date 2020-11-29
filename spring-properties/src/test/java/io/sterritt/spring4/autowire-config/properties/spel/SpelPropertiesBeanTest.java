package io.sterritt.spring4.properties.spel;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = io.sterritt.spring4.properties.spel.SpelAppConfig.class)
public class SpelPropertiesBeanTest extends TestCase {

    @Autowired
    io.sterritt.spring4.properties.spel.SpelPropertiesBean properties;

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

    @Test
    public void testGetArrayProperty() {
        String[] stringProperties = properties.getStringArrayProperty();
        assertEquals(stringProperties.length,3);
        assertEquals(stringProperties[0],"one");
        assertEquals(stringProperties[1],"two");
        assertEquals(stringProperties[2],"three");
    }

    @Test
    public void testGetListProperty() {
        List<String> stringProperties = properties.getListProperty();
        assertEquals(stringProperties.size(),3);
        assertEquals(stringProperties.get(0),"one");
        assertEquals(stringProperties.get(1),"two");
        assertEquals(stringProperties.get(2),"three");
    }
}