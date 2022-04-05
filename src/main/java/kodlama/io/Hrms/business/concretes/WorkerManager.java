package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.UserService;
import kodlama.io.Hrms.business.abstracts.WorkerService;
import kodlama.io.Hrms.core.utilities.randomcodecreate.RandomCode;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.ErrorResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.WorkerDao;
import kodlama.io.Hrms.entitites.concretes.User;
import kodlama.io.Hrms.entitites.concretes.Worker;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.WorkerRegisterDto;
@Service
public class WorkerManager implements WorkerService {
	private WorkerDao workerDao;
	private UserService userService;
	private RandomCode randomCode;
	@Autowired
	public WorkerManager(WorkerDao dao,UserService userService,RandomCode  randomCode) {
		this.workerDao = dao;
		this.userService = userService;
		this.randomCode = randomCode;
	}
	@Override
	public Result add(WorkerRegisterDto workerRegisterDto) {
		
		User user = new User();
		user.setEmail(workerRegisterDto.getEmail());
		user.setPassword(workerRegisterDto.getPassword());
		//System.out.println(user);
		
		//boolean test = true;
		//this.userService.add(user).isSuccess() == true
		if(this.userService.add(user).isSuccess() == true) {
			Worker worker = new Worker();
			worker.setUserId(this.userService.getByEmail(workerRegisterDto.getEmail()).getData().getId());
			worker.setName(workerRegisterDto.getName());
			worker.setSurname(workerRegisterDto.getSurname());
			String code = randomCode.getNumericString();
			while(this.workerDao.findByWorkingCode(code)!=null) {
				code = this.randomCode.getNumericString();
			}
			worker.setWorkingCode(code);
			//System.out.println(worker);
			
			this.workerDao.save(worker);
			return new SuccessResult("Çalışan kaydı oluşturuldu.");
			
		
		}else if(this.userService.add(user).isSuccess() == false) {
			return new ErrorResult("E-mail mevcut");
		}else {
			return new ErrorResult( "Çalışan kaydı oluşturulamadı");
		}
	}
	@Override
	public Result delete(Worker worker) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result update(Worker worker) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<Worker>> getAll() {
		return new SuccessDataResult<List<Worker>>(this.workerDao.findAll(), "Data listelendi");
	}
	@Override
	public DataResult<Worker> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<Worker> getByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<Worker> getByWorkingCode(String workingCode) {
		// TODO Auto-generated method stub
		return new  SuccessDataResult<Worker>(this.workerDao.findByWorkingCode(workingCode), "Data listelendi");
	}
	


}
