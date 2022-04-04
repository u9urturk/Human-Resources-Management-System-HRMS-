package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.CandidateService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Candidate;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.CandidateDto;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	private CandidateService candidateService;
	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService  = candidateService;
	}
	
	@GetMapping("/getallcandidates")
	public DataResult<List<Candidate>>getAll(){
		return this.candidateService.getAll();
	}
	
	@PostMapping("/candidateadd")
	public Result add(@RequestBody CandidateDto candidateDto) {
		return this.candidateService.add(candidateDto);
	}
}
