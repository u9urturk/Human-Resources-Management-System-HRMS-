package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.Hrms.entitites.concretes.Candidate;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.UserWithCandidateDto;

public interface CandidateDao  extends JpaRepository<Candidate	, Integer>{
	
	Candidate findByNationalityIdentity(String natioanlityIdentity);
	
	@Query("Select new kodlama.io.Hrms.entitites.concretes.Dtos.concretes.UserWithCandidateDto"
			+ "(u.id,u.email,c.name,c.surName,c.nationalityIdentity,c.birthYear,c.status) "
			+ "From User u Inner Join Candidate c On u.id = c.userId ")
	List<UserWithCandidateDto> getCandidateDetails();
}
