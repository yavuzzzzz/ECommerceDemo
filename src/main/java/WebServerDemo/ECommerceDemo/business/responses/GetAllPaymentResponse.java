package WebServerDemo.ECommerceDemo.business.responses;

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
public class GetAllPaymentResponse {
    @NotNull
    @NotBlank
    private String id;

    @NotNull
    @NotBlank
    private String orderId;

    @NotNull
    @NotBlank
    @Size(min = 2, max = 30)
    private String paymentMethod;

    @Min(0)
    private int amount;

    @NotNull
    @NotBlank
    private LocalDateTime paymentDate;
}
