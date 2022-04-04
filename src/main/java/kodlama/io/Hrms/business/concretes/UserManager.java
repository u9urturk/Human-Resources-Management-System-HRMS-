package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.UserService;
import kodlama.io.Hrms.business.rules.abstracts.Rules;
import kodlama.io.Hrms.business.rules.concretes.EmailVerification;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.ErrorResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.UserDao;
import kodlama.io.Hrms.entitites.concretes.User;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailVerification rules;
	
	@Autowired
	public UserManager(UserDao userDao ,EmailVerification rules ) {
		super();
		this.userDao = userDao;
		this.rules = rules;
		
	}
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Data listelendi");
	}
	@Override
	public Result add(User user) {
		//Rules rules = new EmailVerification(new UserManager(userDao));
		if(rules.emailVerification(user.getEmail()) == true) {
			this.userDao.save(user);
			return new SuccessResult("Ekleme Başarılı");
		}else if(rules.emailVerification(user.getEmail()) == false){
			return  new ErrorResult("E-mail Mevcut ! ");
			
			
		}else {
			return new ErrorResult("Kullanıcı eklenemedi.");
		}
		
	}
	@Override
	public DataResult<User> getByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Data Getirildi.");
	}

}
