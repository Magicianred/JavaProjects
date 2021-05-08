package eCommerceDemo.business.concretes;
import java.util.List;

import eCommerceDemo.business.abstracts.ActivationService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	ValidationService validationService;
	ActivationService activationService;
	public UserManager(ValidationService validationService, ActivationService activationService) {
		super();
		this.validationService = validationService;
		this.activationService = activationService;
	}

	@Override
	public void add(User user) {
		System.out.println(user.getEmail() + " hesab� eklendi!");	
	}

	@Override
	public void update(User user) {
		System.out.println(user.getEmail() + " hesab� g�ncellendi!");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getEmail() + " hesab� silindi!");
		
	}

	@Override
	public void register(User user) {
		if (validationService.validate(user)) {
			activationService.sendActivationMail(user);
			if (activationService.activeEmail(user)) {
				System.out.println(user.getEmail() + " email adresi ile sisteme kayd�n�z olu�turulmu�tur!");
			} else {
				System.out.println("Email adresininize g�nderilen aktivasyon linkine t�klay�n!");
			}
		}		
	}

	@Override
	public void logIn(User user, String email, String password) {
		if (email == user.getEmail() && password == user.getPassword()) {
			System.out.println("Sisteme ba�ar�yla giri� yap�ld�!");
		} else {
			System.out.println("Mail adresiniz veya �ifreniz hatal�!");
		}
		
	}

	@Override
	public User get(int id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		return null;
	}
	
	
}
