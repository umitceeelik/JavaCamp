package Adapters;
import java.rmi.RemoteException;

import Abstract.ICustomerCheckServise;
import Entities.Customer;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckServise{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}
		return result;
	}

}
