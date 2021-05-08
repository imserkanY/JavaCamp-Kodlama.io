package Concrate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;

	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
		super.Save(customer);
		}else {
			System.out.println("Kiþi bulunamadý.");
		}
	}

}
