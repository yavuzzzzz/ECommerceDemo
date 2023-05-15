package WebServerDemo.ECommerceDemo.business.abstracts;

import WebServerDemo.ECommerceDemo.business.requests.CreateProductRequest;
import WebServerDemo.ECommerceDemo.business.requests.UpdateProductRequest;
import WebServerDemo.ECommerceDemo.business.responses.GetAllProductResponse;
import WebServerDemo.ECommerceDemo.business.responses.GetByIdProductResponse;
import WebServerDemo.ECommerceDemo.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<GetAllProductResponse> getAll();

    GetByIdProductResponse getById(int id);

    void add(CreateProductRequest createProductRequest);

    void update(UpdateProductRequest updateProductRequest);

    void delete(int id);
}
