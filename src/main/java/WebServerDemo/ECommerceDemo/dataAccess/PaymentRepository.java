package WebServerDemo.ECommerceDemo.dataAccess;

import WebServerDemo.ECommerceDemo.entities.concretes.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
