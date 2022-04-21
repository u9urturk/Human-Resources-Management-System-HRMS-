package kodlama.io.Hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.CvService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.CandidateDao;
import kodlama.io.Hrms.dataAccess.abstracts.CandidatePrograminLanguageDao;
import kodlama.io.Hrms.dataAccess.abstracts.CoverLetterDao;
import kodlama.io.Hrms.dataAccess.abstracts.CvDao;
import kodlama.io.Hrms.dataAccess.abstracts.ImageDao;
import kodlama.io.Hrms.dataAccess.abstracts.JobExperienceDao;
import kodlama.io.Hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.io.Hrms.dataAccess.abstracts.LanguageDao;
import kodlama.io.Hrms.dataAccess.abstracts.ProgramingLanguageDao;
import kodlama.io.Hrms.dataAccess.abstracts.SchoolAttendedDao;
import kodlama.io.Hrms.dataAccess.abstracts.candidateLanguageDao;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.CvDetailDto;
import kodlama.io.Hrms.entitites.concretes.cv.CV;
@Service
public class CvManager implements CvService {
	private CandidateDao candidateDao;
	private ImageDao iDao;
	private CvDao cvDao;
	private SchoolAttendedDao scDao;
	private JobExperienceDao jeDao;
	private candidateLanguageDao clDao;
	private CandidatePrograminLanguageDao cplDao;
	private LanguageDao lDao;
	private ProgramingLanguageDao plDao;
	private JobPositionDao jpDao;
	private CoverLetterDao cvlDao;
	
	@Autowired
	public CvManager(CvDao cvDao, SchoolAttendedDao scDao, JobExperienceDao jeDao, candidateLanguageDao clDao,
			CandidatePrograminLanguageDao cplDao, LanguageDao lDao, ProgramingLanguageDao plDao, JobPositionDao jpDao,CoverLetterDao cvlDao,
			ImageDao iDao,CandidateDao candidateDao) {
		super();
		this.cvDao = cvDao;
		this.scDao = scDao;
		this.jeDao = jeDao;
		this.clDao = clDao;
		this.cplDao = cplDao;
		this.lDao = lDao;
		this.plDao = plDao;
		this.jpDao = jpDao;
		this.cvlDao = cvlDao;
		this.iDao = iDao;
		this.candidateDao=candidateDao;
	}

	@Override
	public DataResult<List<CvDetailDto>> getAllDetailsNEW() {
		List<CvDetailDto> cvDetailList = new ArrayList<CvDetailDto>();
		for (CV cv : this.cvDao.findAll()	) {
			CvDetailDto cvDetail = new CvDetailDto();
			cvDetail.setId(cv.getId());
			cvDetail.setGithubAddress(cv.getGithubAddress());
			cvDetail.setLinkedinAddress(cv.getLinkedinAddress());
			cvDetail.setSchoolAttended(this.scDao.findByCandidateId(cv.getCandidateId()));
			cvDetail.setPLanguage(this.plDao.getByCandidateId(cv.getCandidateId()));
			cvDetail.setCoverLetter(this.cvlDao.getByCandidateId(cv.getCandidateId()).getCoverLetter());
			cvDetail.setPhotographUrl(this.iDao.getByUserId(this.candidateDao.getById(cv.getCandidateId()).getUserId()).getImage_url());
			cvDetail.setJobExperience(this.jeDao.getByCandidateId(cv.getCandidateId()));
			cvDetail.setCandidateLanguage(this.clDao.getByCandidateId(cv.getCandidateId()));
			//System.out.println(this.scDao.findByCandidateId(cv.getCandidateId()));
			
			cvDetailList.add(cvDetail);
			
		}
		System.out.println(cvDetailList);
		return new SuccessDataResult<List<CvDetailDto>>(cvDetailList, "Başarılı");
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
