package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.mailVerificationHistory;

public interface MailVerificationHistoryService {
	
	Result add(mailVerificationHistory history);
	Result delete(mailVerificationHistory history);
	Result update(mailVerificationHistory history);
	
	DataResult<List<mailVerificationHistory>> getAll();
	
	DataResult<mailVerificationHistory> getById(int id);
	DataResult<mailVerificationHistory> getByUserId(int userId);
	DataResult<mailVerificationHistory> getByUserEmail(String userEmail);
	
}
