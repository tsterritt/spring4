package io.sterritt.spring4.properties.valueannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = io.sterritt.spring4.properties.valueannotation.ValueAnnotationAppConfig.class)
public class ValueAnnotationsPropertiesBeanTest {

    @Autowired
    io.sterritt.spring4.properties.valueannotation.ValueAnnotationsPropertiesBean properties;

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
        List<String> stringProperties = properties.<String>getListProperty();
        assertEquals(stringProperties.size(),3);
        assertEquals(stringProperties.get(0),"one");
        assertEquals(stringProperties.get(1),"two");
        assertEquals(stringProperties.get(2),"three");
    }
}