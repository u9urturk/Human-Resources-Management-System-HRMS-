package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.cv.CandidateProgramingLanguage;

public interface CandidatePrograminLanguageDao extends JpaRepository<CandidateProgramingLanguage, Integer> {

}
