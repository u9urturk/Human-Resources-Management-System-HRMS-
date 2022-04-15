package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.cv.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience	, Integer>{

}
