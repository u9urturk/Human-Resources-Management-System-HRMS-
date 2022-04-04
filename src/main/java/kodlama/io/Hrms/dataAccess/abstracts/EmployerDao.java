package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
