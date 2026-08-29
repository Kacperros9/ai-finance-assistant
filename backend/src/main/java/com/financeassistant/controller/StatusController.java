package com.financeassistant.controller;

import com.financeassistant.dto.StatusResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/status")
@Tag(name = "Status", description = "Informacje o działającej instancji API")
public class StatusController {

    private final String applicationName;
    private final String applicationVersion;

    public StatusController(
            @Value("${spring.application.name}") String applicationName,
            @Value("${application.version}") String applicationVersion
    ) {
        this.applicationName = applicationName;
        this.applicationVersion = applicationVersion;
    }

    @GetMapping
    @Operation(summary = "Zwraca nazwę, wersję i czas serwera")
    public StatusResponse getStatus() {
        return new StatusResponse(applicationName, applicationVersion, Instant.now());
    }
}
