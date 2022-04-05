package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.VerificationHistoryService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.VerificationHistory;

@RestController
@RequestMapping("/api/verificationhistories")
public class VerificationHistoriesController {
	private VerificationHistoryService historyService;
	@Autowired
	public VerificationHistoriesController(VerificationHistoryService historyService) {
		this.historyService = historyService;
	}
	
	@GetMapping("/getallverificationhistories")
	public DataResult<List<VerificationHistory>> getAll(){
		return this.historyService.getAll();
	}
	
	@PostMapping("verificationhistoryadd")
	public Result add(VerificationHistory verificationHistory) {
		return this.historyService.add(verificationHistory);
	}
}
