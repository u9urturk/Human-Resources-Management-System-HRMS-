package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.CandidateProgramingLanguageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.CandidateProgramingLanguage;

@RestController
@RequestMapping(name="/api/cplanguage")
public class CandidateProgramingLanguageController {
	private CandidateProgramingLanguageService cLPService;
	@Autowired
	public CandidateProgramingLanguageController(CandidateProgramingLanguageService cLPService) {
		super();
		this.cLPService = cLPService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CandidateProgramingLanguage>> getAll(){
		return this.cLPService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateProgramingLanguage  cPLanguage) {
		return this.cLPService.add(cPLanguage);
	}
	//Result delete(CandidateProgramingLanguage  cPLanguage);

	//Result update(CandidateProgramingLanguage  cPLanguage);
}
