package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;

import java.util.Date;

import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostedPositionsDetailsDto implements Dto {

	private int id;
	private String companyName;
	private String webAddress;
	private String phoneNumber;
	private String jobPositionName;
	private String countryName;
	private String cityName;
	private int minSalary;
	private int maxSalary;
	private int numberOfPositions;
	private Date releaseDate;
	private Date applicationDeadline;
	private String jobPositionDescription;
	private boolean status;
	
	
}
