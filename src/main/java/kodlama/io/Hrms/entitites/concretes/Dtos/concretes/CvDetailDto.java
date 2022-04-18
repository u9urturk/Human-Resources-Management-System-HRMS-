package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;

import java.util.List;

import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import kodlama.io.Hrms.entitites.concretes.cv.CandidateLanguage;
import kodlama.io.Hrms.entitites.concretes.cv.CandidateProgramingLanguage;
import kodlama.io.Hrms.entitites.concretes.cv.JobExperience;
import kodlama.io.Hrms.entitites.concretes.cv.SchoolsAttended;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CvDetailDto implements Dto {
	
	private int id;
	
	private List<SchoolsAttended> schooleAddenteds;
	
	private List<JobExperience> jobExperiences;
	
	private List<CandidateLanguage> candidateLanguages;
	
	private List<CandidateProgramingLanguage> candidatePLanguages;
	
	private String photographUrl;
	
	private String githubAddress;
	
	private String linkedinAddress;
	
	private String coverLetter;
}
