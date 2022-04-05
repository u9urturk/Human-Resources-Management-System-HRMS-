package kodlama.io.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.CountryService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.CountryDao;
import kodlama.io.Hrms.entitites.concretes.Country;
@Service
public class CountryManager implements CountryService{
	
	private CountryDao countryDao;
	
	
	@Autowired
	public CountryManager(CountryDao countryDao) {
		super();
		this.countryDao = countryDao;
	}

	@Override
	public DataResult<List<Country>> getAll() {
		return new SuccessDataResult<List<Country>>(this.countryDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(Country country) {
		this.countryDao.save(country);
		return new SuccessResult("Ülke eklendi");
		
	}

	@Override
	public Result delete(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

}
