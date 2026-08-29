package com.financeassistant.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "Dane potrzebne do rejestracji nowego użytkownika")
public record RegisterRequest(

        @Schema(description = "Adres e-mail", example = "kacper@example.com")
        @NotBlank(message = "Adres e-mail jest wymagany")
        @Email(message = "Adres e-mail ma niepoprawny format")
        @Size(max = 254, message = "Adres e-mail może mieć najwyżej 254 znaki")
        String email,

        @Schema(description = "Hasło", example = "bardzoTajneHaslo")
        @NotBlank(message = "Hasło jest wymagane")
        @Size(min = 8, max = 72, message = "Hasło musi mieć od 8 do 72 znaków")
        String password
) {
}
