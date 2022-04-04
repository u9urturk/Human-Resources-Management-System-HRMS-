package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.JobPositionService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.ErrorResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.io.Hrms.entitites.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositoinDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositonDao) {
		this.jobPositoinDao = jobPositonDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		
		if(this.jobPositoinDao.findByPositionName(jobPosition.getPositionName()) == null) {
			this.jobPositoinDao.save(jobPosition);
			return new SuccessResult("Ekleme başarılı");
		}else if (this.jobPositoinDao.findByPositionName(jobPosition.getPositionName()) != null) {
			return new ErrorResult("belirtilen pozisyon mevcut");
		}else {
			return new ErrorResult("Ekleme başarısız");
		}
		
		
	}

	@Override
	public Result delete(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositoinDao.findAll(), "Data listelendi");
	}

	@Override
	public DataResult<JobPosition> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobPosition> getBypositionName(String name) {
		return new SuccessDataResult<JobPosition>(this.jobPositoinDao.findByPositionName(name));
	}



}
