package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.Hrms.entitites.concretes.Worker;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.UserWithWorkerDto;

public interface WorkerDao extends JpaRepository<Worker,Integer>  {
	
	Worker findByWorkingCode(String workingCode);
	
	
	@Query("Select new kodlama.io.Hrms.entitites.concretes.Dtos.concretes.UserWithWorkerDto"
			+ "(u.id,u.email,w.name,w.surname,w.workingCode)"
			+ "From User u , Worker w Where u.id=w.userId")
	List<UserWithWorkerDto> getallWorkerDetails();
}
