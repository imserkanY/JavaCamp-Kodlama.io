
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrate.StarbuckCustomerManager;
import Entities.Customer;


public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager =new StarbuckCustomerManager(new MernisServiceAdapter());
		//BaseCustomerManager customerManager =new NeroCustomerManager();
		customerManager.Save(new Customer(1,"Serkan","YAZLI",2002, 2222222222L));
		//								 id  isim    soyisim d.yýlý T.C no
	}
}
