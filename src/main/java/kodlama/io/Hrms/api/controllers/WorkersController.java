package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.WorkerService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Worker;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.WorkerRegisterDto;

@RestController
@RequestMapping("/api/workers")
public class WorkersController {

	private WorkerService service;
	@Autowired
	public WorkersController(WorkerService service) {
		this.service = service;
	}
	
	@GetMapping("/getallworkers")
	public DataResult<List<Worker>> getAll(){
		return this.service.getAll();
		
	}
	
	@GetMapping("/getbyworkingcode")
	public DataResult<Worker> getByWorkingcode(@RequestParam String code){
		return this.service.getByWorkingCode(code);
		
	}
	
	
	
	@PostMapping("workeradd")
	public Result add(@RequestBody WorkerRegisterDto worker) {
		return this.service.add(worker);
	}
}
