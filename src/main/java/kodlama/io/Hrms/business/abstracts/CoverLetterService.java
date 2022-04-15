package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.CoverLetter;

public interface CoverLetterService {
	
	DataResult<List<CoverLetter>> getAll();
	
	Result add(CoverLetter coverLetter);
	Result update(CoverLetter coverLetter);
	Result delete(CoverLetter coverLetter);
}
