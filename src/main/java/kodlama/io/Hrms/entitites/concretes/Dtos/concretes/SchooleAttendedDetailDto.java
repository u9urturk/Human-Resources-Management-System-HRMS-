package kodlama.io.Hrms.entitites.concretes.Dtos.concretes;

import java.util.Date;

import kodlama.io.Hrms.entitites.concretes.Dtos.abstracts.Dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchooleAttendedDetailDto implements Dto {
	private int candidateId;
	private String schooleName;
	private String department;
	private Date startDate;
	private Date graduateHistory;
}
