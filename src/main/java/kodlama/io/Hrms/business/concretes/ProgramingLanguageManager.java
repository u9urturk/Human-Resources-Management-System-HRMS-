package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.ProgramingLanguageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.ProgramingLanguageDao;
import kodlama.io.Hrms.entitites.concretes.ProgramingLanguage;
@Service
public class ProgramingLanguageManager implements ProgramingLanguageService {
	
	private ProgramingLanguageDao pLDao;
	@Autowired
	public ProgramingLanguageManager(ProgramingLanguageDao pLDao) {
		super();
		this.pLDao = pLDao;
	}

	@Override
	public Result add(ProgramingLanguage pLanguage) {
		this.pLDao.save(pLanguage);
		return new SuccessResult("Veri eklendi.");
	}

	@Override
	public Result delete(ProgramingLanguage pLanguage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(ProgramingLanguage pLanguage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<ProgramingLanguage>> getAll() {
		return new SuccessDataResult<List<ProgramingLanguage>>(this.pLDao.findAll());
	}

}
