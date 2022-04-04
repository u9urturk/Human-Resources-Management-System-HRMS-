package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.Candidate;

public interface CandidateDao  extends JpaRepository<Candidate	, Integer>{
	
	Candidate findByNationalityIdentity(String natioanlityIdentity);
}
