package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.SchoolAttendedService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.SchoolAttendedDao;
import kodlama.io.Hrms.entitites.concretes.cv.SchoolsAttended;
@Service
public class SchoolAttendedManager implements SchoolAttendedService {
	
	private SchoolAttendedDao sADao;
	@Autowired
	public SchoolAttendedManager(SchoolAttendedDao sADao) {
		super();
		this.sADao = sADao;
	}

	@Override
	public DataResult<List<SchoolsAttended>> getAll() {
		
		return new SuccessDataResult<List<SchoolsAttended>>(this.sADao.findAll());
	}

	@Override
	public Result add(SchoolsAttended schoolsAttended) {
		this.sADao.save(schoolsAttended);
		return new SuccessResult("Veri eklendi");
	}

	@Override
	public Result delete(SchoolsAttended schoolsAttended) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(SchoolsAttended schoolsAttended) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<SchoolsAttended>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<SchoolsAttended>>(this.sADao.findByCandidateId(candidateId));
	}

}
