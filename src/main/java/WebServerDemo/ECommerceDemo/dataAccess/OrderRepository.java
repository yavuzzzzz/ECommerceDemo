package WebServerDemo.ECommerceDemo.dataAccess;

import WebServerDemo.ECommerceDemo.entities.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
