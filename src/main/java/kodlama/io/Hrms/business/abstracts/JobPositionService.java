package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.JobPosition;

public interface JobPositionService {
	
	Result add(JobPosition jobPosition);
	Result delete(JobPosition jobPosition);
	Result update(JobPosition jobPosition);
	
	DataResult<List<JobPosition >> getAll();
	
	DataResult<JobPosition> getById(int id);
	DataResult<JobPosition> getBypositionName(String name);
	
	
}
