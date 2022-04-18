package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.CvService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;	
import kodlama.io.Hrms.dataAccess.abstracts.CvDao;
import kodlama.io.Hrms.entitites.concretes.cv.CV;
@Service
public class CvManager implements CvService {
	
	private CvDao cvDao;
	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<CV>> getAll() {
		
		return new SuccessDataResult<List<CV>>(this.cvDao.findAll());
	}

	@Override
	public Result add(CV cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv eklendi.");
				
	}

	@Override
	public Result delete(CV cv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(CV cv) {
		// TODO Auto-generated method stub
		return null;
	}

}
