package usersService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import usersService.model.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/users-service/users")
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	
	@PostMapping("/users-service/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User createdUser = repo.save(user);
		return ResponseEntity.status(201).body(createdUser);
	}
 }
