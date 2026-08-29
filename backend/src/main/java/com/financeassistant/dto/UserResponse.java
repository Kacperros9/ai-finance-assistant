package com.financeassistant.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.Instant;

@Schema(description = "Publiczne dane użytkownika")
public record UserResponse(

        @Schema(description = "Identyfikator użytkownika", example = "1")
        Long id,

        @Schema(description = "Adres e-mail", example = "kacper@example.com")
        String email,

        @Schema(description = "Moment rejestracji w UTC")
        Instant createdAt
) {
}
