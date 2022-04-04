package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.VerificationHistoryService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.VerificationHistoryDao;
import kodlama.io.Hrms.entitites.concretes.VerificationHistory;

@Service
public class VerificationHistoryManager implements VerificationHistoryService{
	
	private VerificationHistoryDao verificationHistoryDao;
	
	@Autowired
	public VerificationHistoryManager(VerificationHistoryDao dao) {
		this.verificationHistoryDao = dao;
	}

	@Override
	public Result add(VerificationHistory verificationHistory) {
		this.verificationHistoryDao.save(verificationHistory);
		return new SuccessResult("ekleme başarılı");
	}

	@Override
	public Result delete(VerificationHistory verificationHistory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(VerificationHistory verificationHistory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<VerificationHistory>> getAll() {
		return new SuccessDataResult<List<VerificationHistory>>(this.verificationHistoryDao.findAll(), "Data listelendi");
	}

	@Override
	public DataResult<VerificationHistory> getByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<VerificationHistory> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
