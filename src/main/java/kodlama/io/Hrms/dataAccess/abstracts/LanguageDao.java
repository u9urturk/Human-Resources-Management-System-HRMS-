package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {
	
}
