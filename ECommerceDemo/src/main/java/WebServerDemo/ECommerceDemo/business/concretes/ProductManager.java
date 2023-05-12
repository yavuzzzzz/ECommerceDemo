package WebServerDemo.ECommerceDemo.business.concretes;

import WebServerDemo.ECommerceDemo.business.abstracts.ProductService;
import WebServerDemo.ECommerceDemo.dataAccess.ProductRepository;
import WebServerDemo.ECommerceDemo.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getById(int id) {
       return productRepository.findById(id);
    }


    @Override
    public void add(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }
}
