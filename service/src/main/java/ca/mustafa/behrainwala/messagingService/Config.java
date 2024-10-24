package ca.mustafa.behrainwala.messagingService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {
    private final String activeProfile;

    public Config(@Value("${spring.profiles.active:}") String activeProfile){
        this.activeProfile = activeProfile;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        if (!"prod".equals(activeProfile)) {
            // required for Node development
            registry.addMapping("/api/**").allowedMethods("*").allowedOrigins("*");
        }
    }

}
