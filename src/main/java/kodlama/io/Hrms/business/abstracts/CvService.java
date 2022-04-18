package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.CV;

public interface CvService {
	
	DataResult<List<CV>> getAll();
	
	Result add(CV cv);
	Result delete(CV cv);
	Result update(CV cv);
	
}
