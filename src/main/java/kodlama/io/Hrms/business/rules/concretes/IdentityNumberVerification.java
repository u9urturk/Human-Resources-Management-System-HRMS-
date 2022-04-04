package kodlama.io.Hrms.business.rules.concretes;

import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.rules.abstracts.Rules;
import kodlama.io.Hrms.dataAccess.abstracts.CandidateDao;
@Service
public class IdentityNumberVerification implements Rules{
	
	
	private CandidateDao candidateDao;
	
	public IdentityNumberVerification(CandidateDao candidateDao) {
		
		this.candidateDao = candidateDao;
	}
	
	public boolean nationalityIdentityVerification(String ıdentityNumber) {
		
		if(this.candidateDao.findByNationalityIdentity(ıdentityNumber) == null) {
			return true;
		}else {
			return false;
		}
		
	}

	
	
	
}
