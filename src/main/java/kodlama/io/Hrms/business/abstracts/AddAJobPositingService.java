package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.AddAJobPosting;

public interface AddAJobPositingService {
	
	DataResult<List<AddAJobPosting>> getAllByStatus(boolean status);
	DataResult<List<AddAJobPosting>> getByUserIdAndStatus(int userId,boolean status);
	DataResult<List<AddAJobPosting>> getByUserId(int userId);
 	DataResult<List<AddAJobPosting>> getAllSorted(boolean status);
	
	
	Result add(AddAJobPosting addAJobPosting);
	Result delete(AddAJobPosting addAJobPosting);
	Result update(AddAJobPosting addAJobPosting);
}
