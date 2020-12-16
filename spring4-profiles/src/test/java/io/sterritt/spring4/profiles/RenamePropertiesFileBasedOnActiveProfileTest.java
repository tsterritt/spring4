package io.sterritt.spring4.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ProfilesAppConfig.class})
@ActiveProfiles("active_profile")
public class RenamePropertiesFileBasedOnActiveProfileTest {

    @Autowired
    RenamePropertiesFileBasedOnActiveProfile renamer;

    Environment env = mock(Environment.class);

    @Test
    public void testRenamingToActiveProfile() {
        assertEquals("active_profile-filename.properties", renamer.renamePropertiesFile("filename.properties"));
    }

    @Test
    public void testMultipleActiveProfiles() {
        when(env.getActiveProfiles()).thenReturn(new String[] {"profile1","profile2"});
        RenamePropertiesFileBasedOnActiveProfile renamer = new RenamePropertiesFileBasedOnActiveProfile(env);
        assertEquals("profile1-profile2-filename.properties", renamer.renamePropertiesFile("filename.properties"));
    }

    @Test
    public void testNoActiveProfiles() {
        when(env.getActiveProfiles()).thenReturn(null);
        RenamePropertiesFileBasedOnActiveProfile renamer = new RenamePropertiesFileBasedOnActiveProfile(env);
        assertEquals("filename.properties", renamer.renamePropertiesFile("filename.properties"));
    }
}