package WebServerDemo.ECommerceDemo.business.abstracts;

import WebServerDemo.ECommerceDemo.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll();

    Optional<Product> getById(int id);

    void add(Product product);

    void update(Product product);

    void delete(int id);
}
