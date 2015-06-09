package com.jboss.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * 
 * @author bmincey
 *
 */
public class CustomerManagerDAOImpl implements CustomerManagerDAO {

	private static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("persistenceUnit");
	
	/**
	 * 
	 */
	@Override
	public List<Customer> getCustomerById(Long id) {
		EntityManager em = emf.createEntityManager();
		List<Customer> customerList = em.createQuery(
				"SELECT c FROM Customer c WHERE c.id LIKE :custId",Customer.class)
				.setParameter("custId", id)
				.setMaxResults(1).getResultList();
		
		return customerList;
	}

	/**
	 * 
	 */
	@Override
	public List<Customer> getAllCustomers() {
		EntityManager em = emf.createEntityManager();
		List<Customer> customerList = em.createQuery(
				"SELECT c FROM Customer c", Customer.class).getResultList();
		return customerList;
	}

	/**
	 * 
	 */
	@Override
	public void insertCustomer(Customer customer) {
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(customer);
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		
		
	}

	/**
	 * 
	 */
	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
