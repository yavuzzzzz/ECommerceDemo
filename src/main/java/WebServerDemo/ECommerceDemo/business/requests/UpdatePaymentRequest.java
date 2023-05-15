package WebServerDemo.ECommerceDemo.business.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePaymentRequest {
    @NotNull
    @NotBlank
    @Size(min = 2, max = 30)
    private String paymentMethod;

    @Min(0)
    private double amount;

    @NotNull
    @NotBlank
    private LocalDateTime paymentDate;

    @NotNull
    @NotBlank
    @Min(0)
    private String orderId;
}
