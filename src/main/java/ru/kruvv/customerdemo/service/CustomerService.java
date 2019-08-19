package ru.kruvv.customerdemo.service;

import java.util.List;

import ru.kruvv.customerdemo.model.Customer;

public interface CustomerService {

	Customer getById(Long id);

	void save(Customer customer);

	void delete(Long id);

	List<Customer> getAll();
}
