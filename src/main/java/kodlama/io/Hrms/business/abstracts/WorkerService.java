package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Worker;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.WorkerRegisterDto;

public interface WorkerService {
	
	Result add(WorkerRegisterDto workerDto);
	Result delete(Worker worker);
	Result update(Worker worker);
	
	DataResult<List<Worker>> getAll();
	DataResult<Worker> getById(int id);
	DataResult<Worker> getByUserId(int userId);
	DataResult<Worker> getByWorkingCode(String workingCode);
	
}
