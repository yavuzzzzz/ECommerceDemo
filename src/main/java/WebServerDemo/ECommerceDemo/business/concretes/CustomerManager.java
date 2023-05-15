package WebServerDemo.ECommerceDemo.business.concretes;

import WebServerDemo.ECommerceDemo.business.abstracts.CustomerService;
import WebServerDemo.ECommerceDemo.dataAccess.CustomerRepository;
import WebServerDemo.ECommerceDemo.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }


    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }


    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElseThrow(() -> new NotFoundException("Customer not found with id: " + id));
    }
}


