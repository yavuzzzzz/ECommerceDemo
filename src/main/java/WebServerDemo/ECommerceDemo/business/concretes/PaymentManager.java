package WebServerDemo.ECommerceDemo.business.concretes;

import WebServerDemo.ECommerceDemo.business.abstracts.PaymentService;
import WebServerDemo.ECommerceDemo.business.requests.CreatePaymentRequest;
import WebServerDemo.ECommerceDemo.business.requests.UpdatePaymentRequest;
import WebServerDemo.ECommerceDemo.business.responses.GetAllPaymentResponse;
import WebServerDemo.ECommerceDemo.business.responses.GetByIdPaymentResponse;
import WebServerDemo.ECommerceDemo.core.utilities.mappers.ModelMapperService;
import WebServerDemo.ECommerceDemo.dataAccess.PaymentRepository;
import WebServerDemo.ECommerceDemo.entities.concretes.Payment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PaymentManager implements PaymentService {
    private PaymentRepository paymentRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllPaymentResponse> getAll() {
        List<Payment> payments = paymentRepository.findAll();
        List<GetAllPaymentResponse> paymentResponse = payments.stream()
                .map(payment -> this.modelMapperService.forResponse().map(payment, GetAllPaymentResponse.class))
                .collect(Collectors.toList());

        return paymentResponse;
    }

    @Override
    public GetByIdPaymentResponse getById(int id) {
        Payment payment = this.paymentRepository.findById(id).orElseThrow();

        return this.modelMapperService.forResponse().map(payment, GetByIdPaymentResponse.class);

    }

    @Override
    public void add(CreatePaymentRequest createPaymentRequest) {
        Payment payment = this.modelMapperService
                .forRequest()
                .map(createPaymentRequest, Payment.class);

        this.paymentRepository.save(payment);

    }

    @Override
    public void update(UpdatePaymentRequest updatePaymentRequest) {
        Payment payment = this.modelMapperService
                .forRequest()
                .map(updatePaymentRequest, Payment.class);

        this.paymentRepository.save(payment);

    }

    @Override
    public void delete(int id) {
        paymentRepository.deleteById(id);

    }

    @Override
    public void pay(CreatePaymentRequest createPaymentRequest) {
//önce iş kuralı yazmak gerek
    }

}
