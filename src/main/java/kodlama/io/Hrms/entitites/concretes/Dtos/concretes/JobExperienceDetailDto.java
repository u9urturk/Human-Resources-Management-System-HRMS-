package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;

import java.util.Date;

import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobExperienceDetailDto implements Dto {
	
	private String workPlace;
	
	private String jobPosition;
	
	private Date startDate;
	
	private Date endDate;
	
}
