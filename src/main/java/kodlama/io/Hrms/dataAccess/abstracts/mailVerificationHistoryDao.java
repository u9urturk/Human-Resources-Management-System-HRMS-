package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.mailVerificationHistory;

public interface mailVerificationHistoryDao extends JpaRepository<mailVerificationHistory, Integer>{

}
