package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.ProgramingLanguage;

public interface ProgramingLanguageDao extends JpaRepository<ProgramingLanguage, Integer> {

}
