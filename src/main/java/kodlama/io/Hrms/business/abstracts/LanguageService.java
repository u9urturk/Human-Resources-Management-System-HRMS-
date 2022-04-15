package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Language;

public interface LanguageService {	
	
	DataResult<List<Language>> getAll();
	
	Result add(Language language);
	Result delete(Language language);

	Result update(Language language);


}
