package WebServerDemo.ECommerceDemo.webApi.controller;

import WebServerDemo.ECommerceDemo.business.abstracts.PaymentService;
import WebServerDemo.ECommerceDemo.business.responses.GetByIdPaymentResponse;
import WebServerDemo.ECommerceDemo.business.responses.GetAllPaymentResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
@AllArgsConstructor
public class PaymentController {
    private PaymentService paymentService;

    @GetMapping()
    public ResponseEntity<List<GetAllPaymentResponse>> getAll() {
        return new ResponseEntity(paymentService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetByIdPaymentResponse> getById(@PathVariable int id) {
        return new ResponseEntity<>(paymentService.getById(id), HttpStatus.OK);
    }
}
