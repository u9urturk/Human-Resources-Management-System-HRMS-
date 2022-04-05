package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entitites.concretes.AddAJobPosting;

public interface AddAJobPositingDao extends JpaRepository<AddAJobPosting, Integer> {
	public List<AddAJobPosting> findAllByStatus(boolean status);
	public List<AddAJobPosting> getByUserIdAndStatus(int id,boolean status);
	public List<AddAJobPosting> findByUserId(int id);
	public List<AddAJobPosting> findByUserIdContaining(int userId ,Sort sort);
	public List<AddAJobPosting> findByStatus(boolean status,Sort sort);
	

}
