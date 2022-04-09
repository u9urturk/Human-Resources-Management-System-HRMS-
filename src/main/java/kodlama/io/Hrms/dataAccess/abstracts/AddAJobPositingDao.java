package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kodlama.io.Hrms.entitites.concretes.AddAJobPosting;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.PostedPositionsDetailsDto;

public interface AddAJobPositingDao extends JpaRepository<AddAJobPosting, Integer> {
	public List<AddAJobPosting> findAllByStatus(boolean status);
	public List<AddAJobPosting> getByEmployerIdAndStatus(int id,boolean status);
	public List<AddAJobPosting> findByEmployerId(int id);
	public List<AddAJobPosting> findByEmployerIdContaining(int employerId ,Sort sort);
	public List<AddAJobPosting> findByStatus(boolean status,Sort sort);
	
	
	@Query("Select new kodlama.io.Hrms.entitites.concretes.Dtos.concretes.PostedPositionsDetailsDto"
			+ "(a.id,e.companyName,e.webAddress,e.phoneNumber,jp.positionName,coy.country,cy.name,"
			+ "a.minSalary,a.maxSalary,a.numberOfPositions,a.releaseDate,a.applicationDeadline,a.jobPositionDescription,a.status)"
			+ "From AddAJobPosting a  Join Employer e On a.employerId = e.id  Join JobPosition jp On a.jobPositionId = jp.id "
			+ " Join Country coy On a.countryId = coy.id  Join City cy On a.cityId = cy.id Where a.status =:status ")
	public List<PostedPositionsDetailsDto> getAllPostedPositionDetailsByStatus(boolean status);
	

}
