package io.sterritt.spring4.properties.environmentclass;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = io.sterritt.spring4.properties.environmentclass.EnvironmentClassAppConfig.class)
public class EnvironmentClassPropertiesBeanTest extends TestCase {

    @Autowired
    io.sterritt.spring4.properties.environmentclass.EnvironmentClassPropertiesBean properties;

    @Test
    public void testGetPropertiesFileProperty() throws Exception {
        assertEquals("first", properties.getPropertiesFileProperty());
    }

    @Test
    public void testDefaultProperty() throws Exception {
        assertEquals("default", properties.getDefaultProperty());
    }

    @Test
    public void testEnvironmentProperty() throws Exception {
        assertEquals(System.getenv("SHELL"), properties.getEnvironmentProperty());
    }

    @Test
    public void testSystemProperty() throws Exception {
        assertEquals(System.getProperty("user.home"), properties.getSystemProperty());
    }

     @Test
    public void testGetArrayProperty() {
        String[] stringProperties = properties.getArrayProperty();
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