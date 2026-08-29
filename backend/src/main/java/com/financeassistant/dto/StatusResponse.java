package com.financeassistant.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.Instant;

@Schema(description = "Podstawowe informacje o działającej instancji API")
public record StatusResponse(

        @Schema(description = "Nazwa aplikacji", example = "backend")
        String application,

        @Schema(description = "Wersja aplikacji", example = "0.0.1-SNAPSHOT")
        String version,

        @Schema(description = "Czas odpowiedzi serwera w UTC")
        Instant timestamp
) {
}
