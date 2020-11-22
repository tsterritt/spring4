package io.sterritt.spring4.properties.valueannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ValueAnnotationAppConfig.class)
public class ValueAnnotationsPropertiesBeanTest {

    @Autowired
    ValueAnnotationsPropertiesBean properties;

    @Test
    public void testGetPropertiesFileProperty() {
        assertEquals("first", properties.getPropertiesFileProperty());
    }

    @Test
    public void testDefaultProperty() {
        assertEquals("default", properties.getDefaultProperty());
    }


    @Test
    public void testSystemProperty() {
        assertEquals(System.getProperty("user.home"), properties.getSystemProperty());
    }

    @Test
    public void testGetEnvironmentVariable() {
        assertEquals(System.getenv("SHELL"), properties.getEnvironmentVariable());
    }
}