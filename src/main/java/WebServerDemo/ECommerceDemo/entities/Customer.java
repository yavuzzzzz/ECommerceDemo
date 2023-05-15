package WebServerDemo.ECommerceDemo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @NotNull(message = "{com.ECommerceDemo.notnull.firstName.message}")
    @Column(name = "firstName")
    private String firstName;

    @NotNull(message = "{com.ECommerceDemo.notnull.firstName.message}")
    @Column(name = "lastName")
    private String lastName;

    @Email(message = "{com.ECommerceDemo.email.message}")
    @Column(name = "email")
    private String eMail;

    @NotNull(message = "{com.ECommerceDemo.notnull.password.message}")
    @Column(name = "password")
    private String password;

    @NotNull(message = "{com.ECommerceDemo.notnull.phoneNumber.message}")
    @Column(name = "phone_number")
    private String phoneNumber;

}
