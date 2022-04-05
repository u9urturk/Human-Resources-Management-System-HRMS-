package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Employer;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.EmployerRegisterDto;

public interface EmployerService {
	
	Result add(EmployerRegisterDto employerDto);
	Result delete(Employer employer);
	Result update(Employer employer);
	
	DataResult<List<Employer>> getAll();
	DataResult<Employer> getById(int id);
	DataResult<Employer> getByUserId(int userId);
	
	
}
