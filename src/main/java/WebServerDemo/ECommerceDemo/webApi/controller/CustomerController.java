package WebServerDemo.ECommerceDemo.webApi.controller;

import WebServerDemo.ECommerceDemo.business.abstracts.CustomerService;
import WebServerDemo.ECommerceDemo.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    @GetMapping()
    public List<Customer> getAll() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }
}
