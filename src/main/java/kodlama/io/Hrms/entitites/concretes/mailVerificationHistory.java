package kodlama.io.Hrms.entitites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="mail_verification_history")
public class mailVerificationHistory {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="send_verification_code")
	private String sendVerificationCode;
	
	@Column(name="status")
	private boolean status;
	
	
}
