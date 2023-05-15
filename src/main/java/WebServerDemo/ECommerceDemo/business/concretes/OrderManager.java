package WebServerDemo.ECommerceDemo.business.concretes;

import WebServerDemo.ECommerceDemo.business.abstracts.OrderService;
import WebServerDemo.ECommerceDemo.business.requests.CreateOrderRequest;
import WebServerDemo.ECommerceDemo.business.requests.UpdateOrderRequest;
import WebServerDemo.ECommerceDemo.business.responses.GetAllOrdersResponse;
import WebServerDemo.ECommerceDemo.business.responses.GetByIdOrderResponse;
import WebServerDemo.ECommerceDemo.entities.concretes.Order;

import java.util.List;

public class OrderManager implements OrderService {
    @Override
    public List<GetAllOrdersResponse> getAll() {
        return null;
    }

    @Override
    public List<GetAllOrdersResponse> getAllByCustomerId(String customerId) {
        return null;
    }

    @Override
    public GetByIdOrderResponse getById(String id) {
        return null;
    }

    @Override
    public Order add(CreateOrderRequest createOrderRequest) {
        return null;
    }

    @Override
    public Order update(UpdateOrderRequest updateOrderRequest) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public double calculateAmount(String id) {
        return 0;
    }
}
