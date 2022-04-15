package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.ProgramingLanguageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.ProgramingLanguage;
@RestController
@RequestMapping("/api/programinglanguage")
public class ProgramingLanguageController {
	
	private ProgramingLanguageService pLService;
	
	@Autowired
	public ProgramingLanguageController(ProgramingLanguageService pLService) {
		super();
		this.pLService = pLService;
	}
	
	
	
	@GetMapping("/getall")
	public DataResult<List<ProgramingLanguage>> getAll(){
		return this.pLService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ProgramingLanguage pLanguage) {
		return this.pLService.add(pLanguage);
	}
	//Result delete(ProgramingLanguage pLanguage);
	//Result update(ProgramingLanguage pLanguage);
	
	
	
}
