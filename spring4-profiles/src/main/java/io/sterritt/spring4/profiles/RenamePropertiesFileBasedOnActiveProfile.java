package io.sterritt.spring4.profiles;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class RenamePropertiesFileBasedOnActiveProfile {

    Environment environment;

    public RenamePropertiesFileBasedOnActiveProfile(@Autowired Environment environment) {
        this.environment = environment;
    }

    public String renamePropertiesFile(String propertiesFileName) {
        String[] activeProfiles = environment.getActiveProfiles();
        StringBuilder profileStringBuilder = new StringBuilder();

        if (activeProfiles != null) {
            for (String activeProfile :activeProfiles){
                profileStringBuilder.append(activeProfile).append("-");
            }
        }

        return profileStringBuilder.append(propertiesFileName).toString();
    }
}
