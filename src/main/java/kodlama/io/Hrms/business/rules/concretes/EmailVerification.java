package kodlama.io.Hrms.business.rules.concretes;



import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.rules.abstracts.Rules;
import kodlama.io.Hrms.dataAccess.abstracts.UserDao;

@Service
public class EmailVerification  implements Rules {

	private UserDao userDao;
	
	
	public EmailVerification(UserDao userDao) {
		super();
		this.userDao = userDao;
	}




	
	public boolean emailVerification(String email) {
		//System.out.println(email);
		if(this.userDao.findByEmail(email) == null) {
			return true;
		}else {
			return false;
		}
	}


	

}
