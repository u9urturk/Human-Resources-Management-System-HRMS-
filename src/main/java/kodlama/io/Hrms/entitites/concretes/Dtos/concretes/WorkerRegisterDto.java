package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;

import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import lombok.Data;

@Data
public class WorkerRegisterDto  implements Dto {
	
	private String email;
	private String password;
	
	
	private String name;
	private String surname;
	
	
}
