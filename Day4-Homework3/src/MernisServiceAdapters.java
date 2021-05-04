import java.rmi.RemoteException;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapters implements UserCheckServise{
	@Override
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName(), user.getLastName(), user.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}
		return result;
	}
}
