package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.CityService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CityController {
	
	private CityService cityService;
	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<City>>getAll(){
		return this.cityService.getAll();
	}
	
	@PostMapping("/addcity")
	public Result add(@RequestBody City city) {
		return this.cityService.add(city);
	}
	
	//Result delete(City city);
	//Result update(City city);
	
}
