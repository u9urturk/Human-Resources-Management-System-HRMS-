package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Country;

public interface CountryService {
	
	DataResult<List<Country>>getAll();
	
	Result add(Country country);
	Result delete(Country country);
	Result update(Country country);
}
