package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.cv.SchoolsAttended;

public interface SchoolAttendedDao extends JpaRepository<SchoolsAttended, Integer> {

}
