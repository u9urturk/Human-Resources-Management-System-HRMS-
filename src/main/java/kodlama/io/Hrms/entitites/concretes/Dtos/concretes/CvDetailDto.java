package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;


import java.util.List;

import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import kodlama.io.Hrms.entitites.concretes.cv.SchoolsAttended;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDetailDto implements Dto {
	
	private int id;

	private String photographUrl;
	
	private String githubAddress;
	
	private String linkedinAddress;
	
	private String coverLetter;
	
	private List<SchoolsAttended> schoolAttended;

	private List<JobExperienceDetailDto> jobExperience;
	
	private List<LanguageDetailDto> candidateLanguage;
	
	private List<ProgramingLanguageDetailDto> pLanguage;

	
	



	


	
	
	
	
}
