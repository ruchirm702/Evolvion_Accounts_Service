package dev.ruchir.evolvion_accounts_service.controller_advise.Payment_Exceptions;

public class PaymentUpdateException extends RuntimeException {
    public PaymentUpdateException(String message) {
        super(message);
    }
    public PaymentUpdateException(String message, Throwable cause) {
        super(message, cause);
    }
}