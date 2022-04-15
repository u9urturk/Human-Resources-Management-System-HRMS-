package kodlama.io.Hrms.entitites.concretes.cv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="candidate_language")
public class CandidateLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="candidate_id")
	private int candidateId;
	
	@Column(name="language_id")
	private int languageId;
	
	@Column(name="language_level")
	private int languageLevel;
}
