package kodlama.io.Hrms.entitites.concretes.cv;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Entity
@Data
@Table(name="")
@AllArgsConstructor
public class CV {
	
	private int id;
	private int candidateId;
	private List<Integer> schooleAttendedId;
	private List<Integer> jobExperienceId;
	private List<Integer> languageId;
	private int photograftId;
	private String githubAddress;
	private String linkedinAddress;
	private List<Integer> programingLanguage;
	private int coverLetterId;
	
	
	
	
}
