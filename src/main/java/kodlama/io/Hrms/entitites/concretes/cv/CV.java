package kodlama.io.Hrms.entitites.concretes.cv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="cv")
@AllArgsConstructor
@NoArgsConstructor
public class CV {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@Column(name="candidate_id")
	private int candidateId;
	
	@Column(name="schoole_attended_id")
	private int candidateSchoolseAttendedId;
	
	@Column(name="job_experience_id")
	private int candidateJobExperiencesId;
	
	@Column(name="language_id")
	private int candidateLanguagesId;
	
	@Column(name="photograft_id")
	private int photograftId;
	
	@Column(name="github_address")
	private String githubAddress;
	
	@Column(name="linkedin_address")
	private String linkedinAddress;
	
	@Column(name="programing_language_id")
	private int candidateProgramingLanguagesId;
	
	@Column(name="cover_letter_id")
	private int coverLetterId;
	
	
	
	
}
