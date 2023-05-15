package WebServerDemo.ECommerceDemo.business.abstracts;

import WebServerDemo.ECommerceDemo.business.requests.CreateProductRequest;
import WebServerDemo.ECommerceDemo.business.requests.UpdateProductRequest;
import WebServerDemo.ECommerceDemo.business.responses.GetAllProductResponse;
import WebServerDemo.ECommerceDemo.business.responses.GetByIdProductResponse;

import java.util.List;

public interface ProductService {
    List<GetAllProductResponse> getAll();

    GetByIdProductResponse getById(int id);

    void add(CreateProductRequest createProductRequest);

    void update(UpdateProductRequest updateProductRequest);

    void delete(int id);
}
