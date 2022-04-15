package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.CandidateLanguageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.candidateLanguageDao;
import kodlama.io.Hrms.entitites.concretes.cv.CandidateLanguage;
@Service
public class CandidateLanguageManager implements CandidateLanguageService {
	
	private candidateLanguageDao cLDao;
	@Autowired
	public CandidateLanguageManager(candidateLanguageDao cLDao) {
		super();
		this.cLDao = cLDao;
	}

	@Override
	public DataResult<List<CandidateLanguage>> getAll() {
		return new SuccessDataResult<List<CandidateLanguage>>(this.cLDao.findAll());
	}

	@Override
	public Result add(CandidateLanguage cLanguage) {
		this.cLDao.save(cLanguage);
		return new SuccessResult("Veri eklendi");
	}

	@Override
	public Result delete(CandidateLanguage cLanguage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(CandidateLanguage cLanguage) {
		// TODO Auto-generated method stub
		return null;
	}

}
