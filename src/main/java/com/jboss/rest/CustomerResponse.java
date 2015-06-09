package com.jboss.rest;
/**
 * 
 */
import java.util.List;

/**
 * 
 * @author bmincey
 *
 */
public class CustomerResponse {
	private List<Customer> customers;
	private String errorMessage;
	private Boolean success = true;
	
	/**
	 * 
	 */
	public CustomerResponse() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Customer> getCustomers() {
		return customers;
	}
	
	/**
	 * 
	 * @param customers
	 */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	
	/**
	 * 
	 * @param errorMessage
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	/**
	 * 
	 * @return
	 */
	public Boolean getSuccess() {
		return success;
	}
	
	/**
	 * 
	 * @param success
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}
}
