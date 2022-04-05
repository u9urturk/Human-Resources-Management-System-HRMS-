package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;

import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import lombok.Data;
@Data
public class CandidateRegisterDto implements Dto {
	
	private String email;
	private String password;
	private String name;
	private String surname;
	private String nationalityIdentity;
	private int birthYear;
	
	
}
