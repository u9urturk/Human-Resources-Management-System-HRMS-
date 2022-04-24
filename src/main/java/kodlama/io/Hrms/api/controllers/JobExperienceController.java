package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.JobExperienceService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.JobExperience;

@RestController
@RequestMapping("/api/jobexperience")
public class JobExperienceController {
	
	private JobExperienceService experienceService;
	
	@Autowired
	public JobExperienceController(JobExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobExperience>> getAll(){
		return this.experienceService.getAll();
	}
	
	@GetMapping("/getallsorted")
	public DataResult<List<JobExperience>> getAllSorted(){
		return this.experienceService.getAllSorted();
	}
	
	@PostMapping("/add")
	public Result add( @RequestBody JobExperience jobExperience) {
		return this.experienceService.add(jobExperience);
	}
	//Result delete(JobExperience jobExperience);

	//Result update(JobExperience jobExperience);
}
