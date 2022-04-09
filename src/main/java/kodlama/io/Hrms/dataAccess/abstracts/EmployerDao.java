package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.Hrms.entitites.concretes.Employer;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.UserWithEmployerDto;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
	@Query("Select new kodlama.io.Hrms.entitites.concretes.Dtos.concretes.UserWithEmployerDto"
			+ "(u.id,u.email,e.companyName,e.webAddress,e.phoneNumber,e.status) "
			+ "From User u Inner Join Employer e On u.id = e.userId")
	List<UserWithEmployerDto> getEmployerDetails();
}
