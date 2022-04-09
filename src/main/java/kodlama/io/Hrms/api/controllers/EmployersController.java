package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.EmployerService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Employer;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.EmployerRegisterDto;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.UserWithEmployerDto;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	private EmployerService employerService;
	@Autowired
	public EmployersController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	@GetMapping("/getallemployers")
	public DataResult<List<Employer>>getAll(){
		return this.employerService.getAll();
	}
	
	@GetMapping("/getallemployersdetails")
	public DataResult<List<UserWithEmployerDto>>getAllEmployerDetails(){
		return this.employerService.getAllEmployerDetails();
	}
	
	@PostMapping("/employeradd")
	public Result add(@RequestBody EmployerRegisterDto employerDto) {
		
		return this.employerService.add(employerDto);
	}
}
