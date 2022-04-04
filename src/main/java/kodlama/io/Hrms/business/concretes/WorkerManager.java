package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.WorkerService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.WorkerDao;
import kodlama.io.Hrms.entitites.concretes.Worker;
@Service
public class WorkerManager implements WorkerService {
	private WorkerDao workerDao;
	@Autowired
	public WorkerManager(WorkerDao dao) {
		this.workerDao = dao;
	}
	@Override
	public Result add(Worker worker) {
		this.workerDao.save(worker);
		return new SuccessResult("ekleme başarılı");
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
	


}
