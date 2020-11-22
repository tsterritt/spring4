package io.sterritt.spring4.properties.environmentclass;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EnvironmentClassAppConfig.class)
public class EnvironmentClassPropertiesBeanTest extends TestCase {

    @Autowired
    EnvironmentClassPropertiesBean properties;

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

}