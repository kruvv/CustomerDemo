package ru.kruvv.customerdemo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.kruvv.customerdemo.model.Customer;
import ru.kruvv.customerdemo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer getById(Long id) {
		logger.info("IN CustomerServiceImpl getById {}", id);
		return customerRepository.findOne(id);
	}

	@Override
	public void save(Customer customer) {
		logger.info("IN CustomerServiceImpl save {}", customer);
		customerRepository.save(customer);
	}

	@Override
	public void delete(Long id) {
		logger.info("IN CustomerServiceImpl delete {}", id);
		customerRepository.delete(id);
	}

	@Override
	public List<Customer> getAll() {
		logger.info("IN CustomerServiceImpl getAll");
		return customerRepository.findAll();
	}

}
