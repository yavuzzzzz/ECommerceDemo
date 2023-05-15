package WebServerDemo.ECommerceDemo.webApi.controller;

import WebServerDemo.ECommerceDemo.business.abstracts.ProductService;
import WebServerDemo.ECommerceDemo.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @GetMapping()
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable int id) {
        return productService.getById(id);
    }

/*    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() Product product) {
        this.productService.add(product);

    }

    @PutMapping
    public void update(@RequestBody Product product) {
        this.productService.update(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.productService.delete(id);

    }*/
}
