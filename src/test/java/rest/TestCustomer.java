/**
 * 
 */
package rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jboss.rest.Customer;

/**
 * @author bmincey
 * 
 */
public class TestCustomer {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	/**
	 * 
	 * @throws Exception
	 */
	@BeforeClass
	public static void init() throws Exception {
		emf = Persistence.createEntityManagerFactory("persistenceUnit");
		em = emf.createEntityManager();
	}

	/**
	 * 
	 */
	@Test
	public void test() {
	
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			createCustomer();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		listCustomers();

	}

	/**
	 * 
	 */
	@AfterClass
	public static void closeEM() {
		em.close();
		emf.close();
	}
	
	/**
	 * 
	 */
	private void createCustomer() {
		Customer customer = new Customer("Blaine", "Mincey", "Woodstock");
		em.persist(customer);
	}

	/**
	 * 
	 */
	private void listCustomers() {
		List<Customer> customerList = em.createQuery(
				"SELECT c FROM Customer c", Customer.class).getResultList();

		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}
}
