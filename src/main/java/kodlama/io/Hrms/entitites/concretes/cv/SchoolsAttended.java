package kodlama.io.Hrms.entitites.concretes.cv;

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
@Table(name="schoole_attended")
public class SchoolsAttended {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="candidate_id")
	private int candidateId;
	
	@Column(name="schoole_name")
	private String schoolName;
	
	@Column(name="department")
	private String department;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="greaduate_history")
	private Date graduateHistory;
	
}
