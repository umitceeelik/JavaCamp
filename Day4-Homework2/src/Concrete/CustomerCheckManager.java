package Concrete;
import Abstract.ICustomerCheckServise;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckServise{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
				
	return true;
		
	
	}
	
}
