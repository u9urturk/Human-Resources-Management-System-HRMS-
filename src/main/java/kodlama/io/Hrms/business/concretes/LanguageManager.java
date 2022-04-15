package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.LanguageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.LanguageDao;
import kodlama.io.Hrms.entitites.concretes.Language;
@Service
public class LanguageManager implements LanguageService {
	
	private LanguageDao lDao;
	@Autowired
	public LanguageManager(LanguageDao lDao) {
		super();
		this.lDao = lDao;
	}

	@Override
	public DataResult<List<Language>> getAll() {

		return new SuccessDataResult<List<Language>>(this.lDao.findAll());
	}

	@Override
	public Result add(Language language) {
		this.lDao.save(language);
		return new SuccessResult("veri eklendi");
	}

	@Override
	public Result delete(Language language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Language language) {
		// TODO Auto-generated method stub
		return null;
	}

}
