package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.ProgramingLanguage;

public interface ProgramingLanguageService {
	DataResult<List<ProgramingLanguage>> getAll();
	
	Result add(ProgramingLanguage pLanguage);
	Result delete(ProgramingLanguage pLanguage);
	Result update(ProgramingLanguage pLanguage);
}
