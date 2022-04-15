package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.CandidateLanguage;

public interface CandidateLanguageService {
	
	DataResult<List<CandidateLanguage>> getAll();
	
	Result add(CandidateLanguage cLanguage);
	Result delete(CandidateLanguage cLanguage);

	Result update(CandidateLanguage cLanguage);

	
}
