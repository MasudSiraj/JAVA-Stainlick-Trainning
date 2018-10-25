package trivera.webshop.model;

import java.text.SimpleDateFormat;
import java.util.Random;


public class CustomerService {
	public static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy");

	
	public Customer addCustomer(String firstName, String familyName, String dateOfBirth, String email){		
		Customer customer = new Customer(getCustomerID());

		customer.setFirstName(firstName);
		customer.setFamilyName(familyName);
		customer.setEmail(email);
		try {
			customer.setDateOfBirth(FORMATTER.parse(dateOfBirth));
		} catch (Exception e) {
			
		}
		
		return customer;
	}
	
	private String getCustomerID(){
		return String.format("%06d", new Random().nextInt(999999));
	}
}
