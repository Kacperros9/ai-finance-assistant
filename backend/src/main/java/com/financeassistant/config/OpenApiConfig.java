package com.financeassistant.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI financeAssistantOpenApi(@Value("${application.version}") String applicationVersion) {
        return new OpenAPI().info(new Info()
                .title("AI Finance Assistant API")
                .description("Backend asystenta finansów osobistych. Wydatki opisane naturalnym językiem trafiają do bazy dopiero po zatwierdzeniu przez użytkownika.")
                .version(applicationVersion));
    }
}
