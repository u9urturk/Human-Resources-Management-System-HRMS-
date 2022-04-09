package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;

import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class UserWithWorkerDto implements Dto{
	
	private int id;
	private String email;
	private String name;
	private String surname;
	private String workingCode;
}
