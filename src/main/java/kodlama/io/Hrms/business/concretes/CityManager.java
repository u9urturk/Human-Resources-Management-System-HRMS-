package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.CityService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.CityDao;
import kodlama.io.Hrms.entitites.concretes.City;

@Service
public class CityManager implements CityService {
	
	private CityDao cityDao;
	@Autowired
	public CityManager(CityDao cityDao){
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("Şehir eklendi");
	}

	@Override
	public Result delete(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(City city) {
		// TODO Auto-generated method stub
		return null;
	}

}
