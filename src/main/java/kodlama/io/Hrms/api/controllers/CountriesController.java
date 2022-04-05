package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.CountryService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Country;
@RestController
@RequestMapping("/api/countries")
public class CountriesController {
	
	private CountryService countryService;


	@Autowired
	public CountriesController(CountryService countryService) {
		super();
		this.countryService = countryService;
	}

	@GetMapping("/getall")
	public DataResult<List<Country>>getAll(){
		return this.countryService.getAll();
	}
	
	@PostMapping("/addcountry")
	public Result add(@RequestBody Country country) {
		return this.countryService.add(country);
	}
	
	//Result delete(City city);
	//Result update(City city);
}
