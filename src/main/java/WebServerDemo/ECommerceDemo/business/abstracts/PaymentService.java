package WebServerDemo.ECommerceDemo.business.abstracts;

import WebServerDemo.ECommerceDemo.business.requests.CreatePaymentRequest;
import WebServerDemo.ECommerceDemo.business.requests.UpdatePaymentRequest;
import WebServerDemo.ECommerceDemo.business.responses.GetAllPaymentResponse;
import WebServerDemo.ECommerceDemo.business.responses.GetByIdPaymentResponse;

import java.util.List;

public interface PaymentService {
    List<GetAllPaymentResponse> getAll();

    GetByIdPaymentResponse getById(int id);

    void add(CreatePaymentRequest createPaymentRequest);

    void pay(CreatePaymentRequest createPaymentRequest );

    void update(UpdatePaymentRequest updatePaymentRequest);

    void delete(int id);
}
