package kodlama.io.Hrms.entitites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="verification_history")
public class VerificationHistory {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="confirming_person_code")
	private String confirmingPersonCode;
	
	@Column(name="verification_time")
	private Date verificationTime;
}
