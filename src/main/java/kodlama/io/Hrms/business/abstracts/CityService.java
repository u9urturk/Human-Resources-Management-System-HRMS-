package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.City;

public interface CityService {
	
	DataResult<List<City>>getAll();
	
	Result add(City city);
	Result delete(City city);
	Result update(City city);
}
