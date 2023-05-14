package WebServerDemo.ECommerceDemo.business.concretes;

import WebServerDemo.ECommerceDemo.business.abstracts.ProductService;
import WebServerDemo.ECommerceDemo.business.requests.CreateProductRequest;
import WebServerDemo.ECommerceDemo.business.requests.UpdateProductRequest;
import WebServerDemo.ECommerceDemo.business.responses.GetAllProductResponse;
import WebServerDemo.ECommerceDemo.business.responses.GetByIdProductResponse;
import WebServerDemo.ECommerceDemo.core.utilities.mappers.ModelMapperService;
import WebServerDemo.ECommerceDemo.dataAccess.ProductRepository;
import WebServerDemo.ECommerceDemo.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private ProductRepository productRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllProductResponse> getAll() {
        List<Product> products = productRepository.findAll();
        List<GetAllProductResponse> productResponse = products.stream()
                .map(product -> this.modelMapperService.forResponse().map(product, GetAllProductResponse.class))
                .collect(Collectors.toList());

        return productResponse;

    }

    @Override
    public GetByIdProductResponse getById(int id) {
        Product product = this.productRepository.findById(id).orElseThrow();

        GetByIdProductResponse response = this.modelMapperService.forResponse().map(product, GetByIdProductResponse.class);

        return response;
    }


    @Override
    public void add(CreateProductRequest createProductRequest) {
        Product product = this.modelMapperService.forRequest().map(createProductRequest, Product.class);
        this.productRepository.save(product);
    }

    @Override
    public void update(UpdateProductRequest updateProductRequest) {
        Product product = this.modelMapperService.forRequest().map(updateProductRequest, Product.class);
        this.productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }
}
