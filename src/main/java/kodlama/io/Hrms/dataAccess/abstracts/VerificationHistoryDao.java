package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.VerificationHistory;
public interface VerificationHistoryDao extends JpaRepository<VerificationHistory, Integer> {

}
