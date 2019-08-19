package ru.kruvv.customerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.kruvv.customerdemo.model.Customer;

/*
 * Repository interface for {@link Customer} class.
 * @author viktor
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
