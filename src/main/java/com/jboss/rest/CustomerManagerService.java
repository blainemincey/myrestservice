package com.jboss.rest;

/**
 * @author bmincey
 *
 */
public class CustomerManagerService implements CustomerManager {
	
	private CustomerManagerDAO customerDAO;
	
	/**
	 * 
	 * @return
	 */
	public CustomerManagerDAO getCustomerDAO() {
		return this.customerDAO;
	}
	
	/**
	 * 
	 * @param customerDAO
	 */
	public void setCustomerDAO(CustomerManagerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	/**
	 * 
	 */
	@Override
	public CustomerResponse getUserById(CustomerRequest request) {
		System.out.println("=== getUserById===");
		CustomerResponse response = new CustomerResponse();
		try {
			response.setCustomers(getCustomerDAO().getCustomerById(request.getCustomer().getId()));
		} catch (Exception e) {
			response.setSuccess(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}
		return response;
	}

	/**
	 * 
	 */
	@Override
	public CustomerResponse getAllCustomers(CustomerRequest request) {
		System.out.println("=== getAllCustomers ===");
		CustomerResponse response = new CustomerResponse();
		try{
			response.setCustomers(getCustomerDAO().getAllCustomers());
			
		} catch (Exception e) {
			response.setSuccess(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}

		return response;
	}

	/**
	 * 
	 */
	@Override
	public CustomerResponse insertCustomer(CustomerRequest request) {
		System.out.println("=== insertCustomer ===");
		CustomerResponse response = new CustomerResponse();
		
		try{
			getCustomerDAO().insertCustomer(request.getCustomer());
			
		} catch (Exception e) {
			response.setSuccess(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}
		
		return response;
	}

	/**
	 * 
	 */
	@Override
	public CustomerResponse updateCustomer(CustomerRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public CustomerResponse deleteCustomer(CustomerRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
