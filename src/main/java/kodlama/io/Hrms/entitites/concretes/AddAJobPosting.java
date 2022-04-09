package kodlama.io.Hrms.entitites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_a_job_posting")
public class AddAJobPosting {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="job_position_id")
	private int jobPositionId;
	
	@Column(name="country_id")
	private int countryId;
	
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="number_of_positions")
	private int numberOfPositions;
	
	@Column(name="release_date")
	private Date releaseDate;
	
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@Column(name="job_position_description")
	private String jobPositionDescription;
	
	@Column(name="status")
	private boolean status;
}
