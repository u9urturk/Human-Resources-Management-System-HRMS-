package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;


import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class UserWithEmployerDto implements Dto{
	
	private int id;
	private String email;
	

	private String companyName;
	
	private String webAddress;
	
	private String phoneNumber;
	
	private boolean status;
	
	
}
