package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.EmployerService;
import kodlama.io.Hrms.business.abstracts.UserService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.ErrorResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.Hrms.entitites.concretes.Employer;
import kodlama.io.Hrms.entitites.concretes.User;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.EmployerRegisterDto;
@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;
	private UserService userService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao ,UserService  userService) {
		
		this.employerDao = employerDao;
		this.userService = userService;
	}

	@Override
	public Result add(EmployerRegisterDto employerDto) {
		User user = new User();
		user.setEmail( employerDto.getEmail());
		user.setPassword(employerDto.getPassword());
		
		if(this.userService.add(user).isSuccess() == true) {
			Employer employer = new Employer();
			employer.setUserId(this.userService.getByEmail(user.getEmail()).getData().getId());
			employer.setCompanyName(employerDto.getCompanyName());
			employer.setPhoneNumber(employerDto.getPhoneNumber());
			employer.setWebAddress(employerDto.getWebAddress());
			
			this.employerDao.save(employer);
			
			return new SuccessResult("iş veren eklendi");
			
		}else if(this.userService.add(user).isSuccess() == false) {
			return new ErrorResult("E-mail mevcut");
		}else {
			return new ErrorResult("İş veren eklenemedi.");
		}
		
		
		
		
	}

	@Override
	public Result delete(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new  SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data listelendi");
	}

	@Override
	public DataResult<Employer> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employer> getByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}


}
