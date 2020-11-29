package io.sterritt.spring4.profiles;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ProfilesAppConfig.class)
@ActiveProfiles("test")
public class TestEnvironmentConfigurationTest {

    @Autowired
    ExternalEnvironmentConfiguration configuredEnvironment;

    @Test
    public void testConfiguredEnvironmentProperty() throws Exception {
        assertEquals("test environment", configuredEnvironment.getConfiguredProperty());
    }

}