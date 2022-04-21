package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.CvDetailDto;
import kodlama.io.Hrms.entitites.concretes.cv.CV;

public interface CvDao extends JpaRepository<CV, Integer> {
	

	
}
