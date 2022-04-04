package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.MailVerificationHistoryService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.mailVerificationHistoryDao;
import kodlama.io.Hrms.entitites.concretes.mailVerificationHistory;

@Service
public class MailVerificationHistoryManager implements MailVerificationHistoryService{
	
	private mailVerificationHistoryDao verificationDao;
	
	@Autowired
	public MailVerificationHistoryManager(mailVerificationHistoryDao mailVerificationHistory) {
		this.verificationDao = mailVerificationHistory;
	}

	@Override
	public Result add(mailVerificationHistory history) {
		
		this.verificationDao.save(history);
		return new SuccessResult("Ekleme başarılı");
	}

	@Override
	public Result delete(mailVerificationHistory history) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(mailVerificationHistory history) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<mailVerificationHistory>> getAll() {
		return new SuccessDataResult<List<mailVerificationHistory>>(this.verificationDao.findAll(), "Data listelendi");
	}

	@Override
	public DataResult<mailVerificationHistory> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<mailVerificationHistory> getByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<mailVerificationHistory> getByUserEmail(String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
