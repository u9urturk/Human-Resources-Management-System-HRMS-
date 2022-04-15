package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.CandidateLanguageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.CandidateLanguage;

@RestController
@RequestMapping("/api/candidatelanguage")
public class CandidateLanguageController {
	
	private CandidateLanguageService cLService;
	@Autowired
	public CandidateLanguageController(CandidateLanguageService cLService) {
		super();
		this.cLService = cLService;
	}

	@GetMapping("/getall")
	public DataResult<List<CandidateLanguage>> getAll(){
		return this.cLService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CandidateLanguage cLanguage) {
		return this.cLService.add(cLanguage);
	}
	//Result delete(CandidateLanguage cLanguage);

	//Result update(CandidateLanguage cLanguage);
}
