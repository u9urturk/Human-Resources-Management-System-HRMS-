package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.AddAJobPositingService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.AddAJobPositingDao;
import kodlama.io.Hrms.entitites.concretes.AddAJobPosting;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.PostedPositionsDetailsDto;
@Service
public class AddAJobPositingManager implements AddAJobPositingService {
	
	private AddAJobPositingDao addAJobPositingDao;
	
	@Autowired
	public AddAJobPositingManager(AddAJobPositingDao addAJobPositingDao) {
		super();
		this.addAJobPositingDao = addAJobPositingDao;
	}

	@Override
	public DataResult<List<AddAJobPosting>> getAllByStatus(boolean status) {
		return new SuccessDataResult<List<AddAJobPosting>>(this.addAJobPositingDao.findAllByStatus(status), "Data listelendi");
	}

	@Override
	public DataResult<List<AddAJobPosting>> getByUserIdAndStatus(int employerId, boolean status) {
		return new SuccessDataResult<List<AddAJobPosting>>(this.addAJobPositingDao.getByEmployerIdAndStatus(employerId, status), "Data listelendi");
	}

	@Override
	public DataResult<List<AddAJobPosting>> getByUserId(int userId) {
		return new SuccessDataResult<List<AddAJobPosting>>(this.addAJobPositingDao.findByEmployerId(userId), "Data listelendi");
	}

	@Override
	public Result add(AddAJobPosting addAJobPosting) {
		
		this.addAJobPositingDao.save(addAJobPosting);
		return new SuccessResult("iş ilanı eklendi");
	}

	@Override
	public Result delete(AddAJobPosting addAJobPosting) {
		this.addAJobPositingDao.save(addAJobPosting);
		return new SuccessResult("iş ilanı eklendi");
	}

	@Override
	public Result update(AddAJobPosting addAJobPosting) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AddAJobPosting>> getAllSorted(boolean status) {
		
		Sort sort = Sort.by(Sort.Direction.DESC,"releaseDate");
		
		return new SuccessDataResult<List<AddAJobPosting>>( this.addAJobPositingDao.findByStatus(status, sort),"Data Yayın tarihine göre sıralandı.");
	}

	@Override
	public DataResult<List<PostedPositionsDetailsDto>> getAllPostedPositionDetailsByStatus(boolean status) {
		return new SuccessDataResult<List<PostedPositionsDetailsDto>>(this.addAJobPositingDao.getAllPostedPositionDetailsByStatus(status));
	}

}
