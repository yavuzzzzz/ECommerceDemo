package WebServerDemo.ECommerceDemo.business.abstracts;

import WebServerDemo.ECommerceDemo.entities.Product;

import graphql.schema.DataFetcher;
import WebServerDemo.ECommerceDemo.entities.User;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User getUserById(Long userId);

    User getUserInfo(String email);

    Page<User> getAllUsers(Pageable pageable);

    List<Product> getCart(List<Long> perfumeIds);

    User updateUserInfo(String email, User user);

    DataFetcher<List<User>> getAllUsersByQuery();

    DataFetcher<User> getUserByQuery();
}