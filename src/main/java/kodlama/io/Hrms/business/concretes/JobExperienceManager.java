package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.JobExperienceService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.JobExperienceDao;
import kodlama.io.Hrms.entitites.concretes.cv.JobExperience;


@Service
public class JobExperienceManager implements JobExperienceService{
	private JobExperienceDao jExperienceDao;
	@Autowired
	public JobExperienceManager(JobExperienceDao jExperienceDao) {
		super();
		this.jExperienceDao = jExperienceDao;
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		
		return new SuccessDataResult<List<JobExperience>>(this.jExperienceDao.findAll());
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jExperienceDao.save(jobExperience);
		return new SuccessResult("veri eklendi");
	}

	@Override
	public Result delete(JobExperience jobExperience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(JobExperience jobExperience) {
		// TODO Auto-generated method stub
		return null;
	}

}
