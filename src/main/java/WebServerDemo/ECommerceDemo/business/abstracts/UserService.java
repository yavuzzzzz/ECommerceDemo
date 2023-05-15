package WebServerDemo.ECommerceDemo.business.abstracts;

import WebServerDemo.ECommerceDemo.entities.Product;
import WebServerDemo.ECommerceDemo.entities.User.SignInDto;
import WebServerDemo.ECommerceDemo.business.responses.SignInResponseDto ;
import WebServerDemo.ECommerceDemo.business.responses.SignupResponseDto;
import WebServerDemo.ECommerceDemo.entities.User.SignupDto;
import WebServerDemo.ECommerceDemo.entities.User.User;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User getUserById(Long userId);

    User getUserInfo(String email);

    Page<User> getAllUsers(Pageable pageable);

    List<Product> getCart(List<Long> perfumeIds);

    User updateUserInfo(String email, User user);




}