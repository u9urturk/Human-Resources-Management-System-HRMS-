package kodlama.io.Hrms.entitites.concretes.cv;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="")
public class Photograph {
	@Id
	private int id;
	private int candidateId;
	private String photograph;
	
}
