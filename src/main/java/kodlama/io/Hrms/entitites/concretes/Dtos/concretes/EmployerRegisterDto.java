package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;

import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import lombok.Data;
@Data
public class EmployerRegisterDto implements Dto {
	
	private String email;
	private String password;
	private String companyName;
	private String webAddress;
	private String phoneNumber;
}
