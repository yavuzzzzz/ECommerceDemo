package WebServerDemo.ECommerceDemo.webApi.controller;

import WebServerDemo.ECommerceDemo.business.abstracts.ProductService;
import WebServerDemo.ECommerceDemo.business.responses.GetAllProductResponse;
import WebServerDemo.ECommerceDemo.business.responses.GetByIdProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @GetMapping()
    public List<GetAllProductResponse> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdProductResponse getById(@PathVariable int id) {
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
