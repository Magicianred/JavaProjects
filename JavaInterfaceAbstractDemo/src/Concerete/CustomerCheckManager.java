package Concerete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println("Fake kimlik do�rulama ba�ar�l�!");
		return true;
	}
}
