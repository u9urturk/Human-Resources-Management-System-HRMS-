package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Candidate;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.CandidateRegisterDto;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.UserWithCandidateDto;

public interface CandidateService {
	
	Result add(CandidateRegisterDto candidateDto);
	Result delete(Candidate candidate);
	Result update(Candidate candidate);
	
	
	DataResult<List<Candidate>> getAll();
	DataResult<List<UserWithCandidateDto>> getCandidateDetails();
	
	DataResult<Candidate> getByUserId(int userId);
	DataResult<Candidate> getById(int Id);
	DataResult<Candidate> getByNationalityIdentity(String nationalityIdentity);
	
	
	
	
}

