package app.dao;

import app.entity.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by marcin at 22.09.18
 **/

public interface CustomerDAO {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int customerId);

    void deleteCustomer(int customerId);
}
