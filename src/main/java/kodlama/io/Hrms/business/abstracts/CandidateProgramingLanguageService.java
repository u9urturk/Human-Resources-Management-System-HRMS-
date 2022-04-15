package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.CandidateProgramingLanguage;

public interface CandidateProgramingLanguageService {
	
	DataResult<List<CandidateProgramingLanguage>> getAll();
	
	Result add(CandidateProgramingLanguage  cPLanguage);
	Result delete(CandidateProgramingLanguage  cPLanguage);

	Result update(CandidateProgramingLanguage  cPLanguage);

}
