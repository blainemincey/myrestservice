/**
 * 
 */
package com.jboss.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author bmincey
 *
 */

@Consumes("application/json")
@Produces("application/json")
public interface CustomerManager {

	@POST
	@Path("/getCustomerById")
	public CustomerResponse getUserById(CustomerRequest request);
	
	@POST
	@Path("/getAllCustomers")
	public CustomerResponse getAllCustomers(CustomerRequest request);
	
	@POST
	@Path("/insertCustomer")
	public CustomerResponse insertCustomer(CustomerRequest request);
	
	@POST
	@Path("/updateCustomer")
	public CustomerResponse updateCustomer(CustomerRequest request);
	
	@POST
	@Path("/deleteCustomer")
	public CustomerResponse deleteCustomer(CustomerRequest request);
	
}
