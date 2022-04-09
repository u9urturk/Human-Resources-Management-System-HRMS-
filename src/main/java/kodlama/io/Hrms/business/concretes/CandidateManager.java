package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.CandidateService;
import kodlama.io.Hrms.business.abstracts.UserService;
import kodlama.io.Hrms.business.rules.concretes.IdentityNumberVerification;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.ErrorResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.core.utilities.results.mernis.MernisVerificationAdapter;
import kodlama.io.Hrms.dataAccess.abstracts.CandidateDao;
import kodlama.io.Hrms.entitites.concretes.Candidate;
import kodlama.io.Hrms.entitites.concretes.User;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.CandidateRegisterDto;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.UserWithCandidateDto;

@Service
public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;
	private UserService userService;
	private IdentityNumberVerification rule;
	private MernisVerificationAdapter rule2;
	@Autowired
	public CandidateManager(CandidateDao candidateDao,UserService userService ,
			IdentityNumberVerification  rule,MernisVerificationAdapter rule2) {
		super();
		this.candidateDao = candidateDao;
		this.userService = userService;
		this.rule = rule;
		this.rule2 = rule2;
	}
	@Override
	public Result add(CandidateRegisterDto candidateDto) {
		User user = new User();
		user.setEmail(candidateDto.getEmail());
		user.setPassword(candidateDto.getPassword());
		
		if(this.userService.add(user).isSuccess() == true && 
				rule.nationalityIdentityVerification(candidateDto.getNationalityIdentity()) == true && 
				this.rule2.mernisVerification()) {
			
			Candidate candidate = new Candidate();
			candidate.setUserId(this.userService.getByEmail(user.getEmail()).getData().getId());
			candidate.setName(candidateDto.getName());
			candidate.setSurName(candidateDto.getSurname());
			candidate.setNationalityIdentity(candidateDto.getNationalityIdentity());
			candidate.setBirthYear(candidateDto.getBirthYear());
			
			this.candidateDao.save(candidate);
			return new SuccessResult("Aday eklendi.");
					
			
		}
		else if (this.userService.add(user).isSuccess() == false) {
			return new  ErrorResult("E-mail Mevcut");
		}
		else if(rule.nationalityIdentityVerification(candidateDto.getNationalityIdentity()) == false) {
			return new ErrorResult("Belirtilen kimlik numarasıyla üyelik mevcut");
		}else if(rule2.mernisVerification() == false) {
			return new ErrorResult("TC vatandaşlığı doğrulanamadı");
		}
		
		return new ErrorResult("aday ekleme başarısız");
	}
	@Override
	public Result delete(Candidate candidate) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result update(Candidate candidate) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Data listelendi");
	}
	@Override
	public DataResult<Candidate> getByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<Candidate> getById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<Candidate> getByNationalityIdentity(String nationalityIdentity) {
		
		return new SuccessDataResult<Candidate>(this.candidateDao.findByNationalityIdentity(nationalityIdentity));
	}
	@Override
	public DataResult<List<UserWithCandidateDto>> getCandidateDetails() {
		
		return new SuccessDataResult<List<UserWithCandidateDto>>(this.candidateDao.getCandidateDetails(), "Join tablo getirildi.");
	}

	

}
