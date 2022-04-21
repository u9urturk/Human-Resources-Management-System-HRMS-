package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.SchoolAttendedService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.SchoolsAttended;

@RestController
@RequestMapping("/api/schooleattended")
public class SchoolAttendedController {
	
	private SchoolAttendedService attendedService;
	
	@Autowired
	public SchoolAttendedController(SchoolAttendedService attendedService) {
		super();
		this.attendedService = attendedService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SchoolsAttended>> getAll(){
		return this.attendedService.getAll();
	}
	
	@GetMapping("/getbycandidateid")
	public DataResult<List<SchoolsAttended>> getByCandidateId(@RequestParam int candidateId){
		return this.attendedService.getByCandidateId(candidateId);
	}
	@PostMapping("/add")
	public Result add(@RequestBody SchoolsAttended schoolsAttended) {
		return this.attendedService.add(schoolsAttended);
	}
	//Result delete(SchoolsAttended schoolsAttended);
	//Result update(SchoolsAttended schoolsAttended);
	
}
