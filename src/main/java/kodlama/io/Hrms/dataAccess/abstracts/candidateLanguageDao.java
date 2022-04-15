package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.cv.CandidateLanguage;

public interface candidateLanguageDao extends JpaRepository<CandidateLanguage, Integer> {

}
