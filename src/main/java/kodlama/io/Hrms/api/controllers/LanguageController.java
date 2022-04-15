package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.LanguageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Language;

@RestController
@RequestMapping("/api/language")
public class LanguageController {
	
	private LanguageService lService;
	@Autowired
	public LanguageController(LanguageService lService) {
		super();
		this.lService = lService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Language>> getAll(){
		return this.lService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.lService.add(language);
	}
	
	//Result delete(Language language);

	//Result update(Language language);
	
}
