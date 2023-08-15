package usersService;

import org.springframework.data.jpa.repository.JpaRepository;

import usersService.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
