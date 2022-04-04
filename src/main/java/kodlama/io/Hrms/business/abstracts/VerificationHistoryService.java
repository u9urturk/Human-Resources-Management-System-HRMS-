package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.VerificationHistory;

public interface VerificationHistoryService {
	
	Result add(VerificationHistory verificationHistory);
	Result delete(VerificationHistory verificationHistory);
	Result update(VerificationHistory verificationHistory);
	
	DataResult<List<VerificationHistory>> getAll();
	
	DataResult<VerificationHistory> getByUserId(int userId);
	DataResult<VerificationHistory> getById(int id);
}
