package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.JobExperience;

public interface JobExperienceService {
	
	DataResult<List<JobExperience>> getAll();
	DataResult<List<JobExperience>> getAllSorted();
	
	Result add(JobExperience jobExperience);
	Result delete(JobExperience jobExperience);

	Result update(JobExperience jobExperience);

}
