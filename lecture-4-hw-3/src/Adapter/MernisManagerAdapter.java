package Adapter;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManagerAdapter implements UserCheckService{
	@Override
	public boolean ChekIfRealPerson(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(user.getNationalId(), user.getFirstName(), user.getLastName(), user.getBirthYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
