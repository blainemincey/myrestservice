package com.jboss.rest;

import java.util.List;
import com.jboss.rest.Customer;

/**
 * 
 * @author bmincey
 *
 */
public interface CustomerManagerDAO {
	
	public List<Customer> getCustomerById(Long id);
	public List<Customer> getAllCustomers();
	public void insertCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	
}
