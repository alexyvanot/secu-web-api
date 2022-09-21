package fr.alexyvanot.secuwebapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.alexyvanot.secuwebapi.core.User;
import fr.alexyvanot.secuwebapi.sql.UserRepo;

@RestController
public class IndexController {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/newUser")
	public void addRandomUser() {
		User user = new User();
		user.setLastName("Toto" + Math.random());
		user.setFirstName("Tata" + Math.random());
		userRepo.save(user);
	}

	@GetMapping("/user")
	public Iterable<User> getUtilisateurs() {
		return userRepo.findAll();
	}

	@GetMapping("/")
	public User index() {
		User user = new User();
		user.setLastName("Toto");
		user.setFirstName("Tata");
		return user;
	}

	public UserRepo getUtilisateurRepository() {
		return userRepo;
	}

	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
}
