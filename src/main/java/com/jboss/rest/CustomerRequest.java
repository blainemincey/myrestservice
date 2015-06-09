package com.jboss.rest;

/**
 * 
 * @author bmincey
 *
 */
public class CustomerRequest {

	private Customer customer;
	
	/**
	 * 
	 */
	public CustomerRequest(){
		
	}
	
	/**
	 * 
	 * @return
	 */
	public Customer getCustomer() {
		return this.customer;
	}
	
	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
