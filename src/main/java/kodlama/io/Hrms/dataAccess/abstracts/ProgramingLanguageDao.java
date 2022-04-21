package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.Hrms.entitites.concretes.ProgramingLanguage;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.ProgramingLanguageDetailDto;

public interface ProgramingLanguageDao extends JpaRepository<ProgramingLanguage, Integer> {
	
	@Query("Select new kodlama.io.Hrms.entitites.concretes.Dtos.concretes.ProgramingLanguageDetailDto"
			+ "(pl.pLanguageName)"
			+ "From CandidateProgramingLanguage cpl Join ProgramingLanguage pl On cpl.programingLanguageId =  pl.id Where cpl.candidateId =:candidateId ")
	public List<ProgramingLanguageDetailDto> getByCandidateId(int candidateId);
}
