package WebServerDemo.ECommerceDemo.business.abstracts;

import WebServerDemo.ECommerceDemo.business.requests.CreateOrderRequest;
import WebServerDemo.ECommerceDemo.business.requests.UpdateOrderRequest;
import WebServerDemo.ECommerceDemo.business.responses.GetAllOrdersResponse;
import WebServerDemo.ECommerceDemo.business.responses.GetByIdOrderResponse;
import WebServerDemo.ECommerceDemo.entities.concretes.Order;

import java.util.List;

public interface OrderService {
    List<GetAllOrdersResponse> getAll();
    List<GetAllOrdersResponse> getAllByCustomerId(String customerId);
    GetByIdOrderResponse getById(String id);
    Order add(CreateOrderRequest createOrderRequest);
    Order update(UpdateOrderRequest updateOrderRequest);
    void delete(String id);
    double calculateAmount(String id);
//    void confirmCart(ConfirmCartRequest confirmCartRequest,String customerID);

    //    List<GetMyOrdersDetailedResponse> getAllOrdersDetailedByCustomerId(String customerId);
//    GetMyOrdersDetailedResponse getOrdersDetailedByCustomerId(String customerId,String id);
}
