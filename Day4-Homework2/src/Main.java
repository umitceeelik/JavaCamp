import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucsCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucsCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(new Customer(1, "Emre", "Çelik", "62260297880", new Date(1998, 11, 3)));
		
		System.out.println();
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.save(new Customer(1, "Ümit", "Çelik", "62260297880", new Date(1998, 11, 3)));
	}

}
