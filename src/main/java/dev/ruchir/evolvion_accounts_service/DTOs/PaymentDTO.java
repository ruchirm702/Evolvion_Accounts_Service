package dev.ruchir.evolvion_accounts_service.DTOs;

import dev.ruchir.evolvion_accounts_service.models.enums.PaymentStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {

    private Long id;

    @NotBlank(message = "Payment number cannot be blank")
    private String paymentNumber;

    @NotNull(message = "Amount cannot be null")
    @Positive(message = "Amount must be positive")
    private Double amount;

    private PaymentStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
