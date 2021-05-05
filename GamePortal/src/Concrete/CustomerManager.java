package Concrete;

import Abstract.CustomerService;
import Abstract.ValidationService;
import Entities.Customer;

public class CustomerManager implements CustomerService{
	
	private ValidationService validationService;
	
	

	public CustomerManager(ValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void add(Customer customer) {
		if(validationService.validate(customer)) {
			System.out.println(customer.getEmail() + " email adresli kullan�c� olu�turuldu!");
		}else {
			System.out.println("Kimlik do�rulama hatas�!");
		}
		
	}

	@Override
	public void update(Customer customer) {
		if(validationService.validate(customer)) {
			System.out.println(customer.getEmail() + " email adresli kullan�c� g�ncellendi!");
		}else {
			System.out.println("Kimlik do�rulama hatas�!");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getEmail() + " email adresli kullan�c� silindi!");
		
	}

}
