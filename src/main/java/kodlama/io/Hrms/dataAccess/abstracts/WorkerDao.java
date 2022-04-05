package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.Worker;

public interface WorkerDao extends JpaRepository<Worker,Integer>  {
	
	Worker findByWorkingCode(String workingCode);
}
