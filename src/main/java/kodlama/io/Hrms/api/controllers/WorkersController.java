package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.WorkerService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Worker;

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
	
	@PostMapping("workeradd")
	public Result add(Worker worker) {
		return this.service.add(worker);
	}
}
