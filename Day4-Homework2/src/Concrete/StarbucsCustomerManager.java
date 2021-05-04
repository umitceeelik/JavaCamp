package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckServise;
import Entities.Customer;

public class StarbucsCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckServise customerCheckServise;
		
	public StarbucsCustomerManager(ICustomerCheckServise customerCheckServise) {
		
		this.customerCheckServise = customerCheckServise;
	}

	@Override
	public void save(Customer customer) {
		
		if(customerCheckServise.CheckIfRealPerson(customer)) {
			System.out.println("The Person is valid : " + customer.getFirstName());
			super.save(customer);
		}
		else {
			System.out.println("The person is not valid : " + customer.getFirstName());	
		}
		
	}
	
		
	
}




