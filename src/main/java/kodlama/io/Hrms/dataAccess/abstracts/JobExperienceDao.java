package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.JobExperienceDetailDto;
import kodlama.io.Hrms.entitites.concretes.cv.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience	, Integer>{
	
	@Query("Select new kodlama.io.Hrms.entitites.concretes.Dtos.concretes.JobExperienceDetailDto"
			+ "(je.workPlace,jp.positionName,je.startDate,je.endDate)"
			+ "From JobExperience je Join JobPosition jp On je.jobPositionId = jp.id Where je.candidateId =:candidateId ")
	public List<JobExperienceDetailDto> getByCandidateId(int candidateId);
}
