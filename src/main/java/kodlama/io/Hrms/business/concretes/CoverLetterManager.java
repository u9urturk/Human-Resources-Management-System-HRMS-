package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.CoverLetterService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.CoverLetterDao;
import kodlama.io.Hrms.entitites.concretes.cv.CoverLetter;
@Service
public class CoverLetterManager implements CoverLetterService {
	private CoverLetterDao coverLetterDao;
	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAll());
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Veri eklendi");
	}

	@Override
	public Result update(CoverLetter coverLetter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(CoverLetter coverLetter) {
		// TODO Auto-generated method stub
		return null;
	}

}
