package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.LanguageDetailDto;
import kodlama.io.Hrms.entitites.concretes.cv.CandidateLanguage;

public interface candidateLanguageDao extends JpaRepository<CandidateLanguage, Integer> {
	
	@Query("Select new kodlama.io.Hrms.entitites.concretes.Dtos.concretes.LanguageDetailDto"
			+ "(l.language,cl.languageLevel)"
			+ "From CandidateLanguage cl Join Language l On cl.languageId = l.id Where cl.candidateId =:candidateId ")
	public List<LanguageDetailDto> getByCandidateId(int candidateId);
	
}
