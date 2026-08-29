package com.financeassistant.exception;

public class EmailAlreadyUsedException extends RuntimeException {

    public EmailAlreadyUsedException(String email) {
        super("Konto o adresie %s już istnieje".formatted(email));
    }
}
