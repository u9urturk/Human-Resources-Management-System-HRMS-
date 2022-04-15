package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.CandidateProgramingLanguageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.CandidatePrograminLanguageDao;
import kodlama.io.Hrms.entitites.concretes.cv.CandidateProgramingLanguage;
@Service
public class CandidateProgramingLanguageManager implements CandidateProgramingLanguageService{
	private CandidatePrograminLanguageDao cPLDao;
	@Autowired
	public CandidateProgramingLanguageManager(CandidatePrograminLanguageDao cPLDao) {
		super();
		this.cPLDao = cPLDao;
	}

	@Override
	public DataResult<List<CandidateProgramingLanguage>> getAll() {
		
		return new SuccessDataResult<List<CandidateProgramingLanguage>>(this.cPLDao.findAll());
	}

	@Override
	public Result add(CandidateProgramingLanguage cPLanguage) {
		
		this.cPLDao.save(cPLanguage);
		return new SuccessResult("Veri eklendi");
		
	}

	@Override
	public Result delete(CandidateProgramingLanguage cPLanguage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(CandidateProgramingLanguage cPLanguage) {
		// TODO Auto-generated method stub
		return null;
	}

}
