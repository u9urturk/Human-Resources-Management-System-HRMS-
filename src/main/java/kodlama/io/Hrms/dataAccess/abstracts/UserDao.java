package kodlama.io.Hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	User findByEmail(String email);
}
