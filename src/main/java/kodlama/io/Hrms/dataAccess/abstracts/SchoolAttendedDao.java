package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.SchooleAttendedDetailDto;
import kodlama.io.Hrms.entitites.concretes.cv.SchoolsAttended;

public interface SchoolAttendedDao extends JpaRepository<SchoolsAttended, Integer> {
	
	
	public List<SchoolsAttended> findByCandidateId(int candidateId);
	
}
