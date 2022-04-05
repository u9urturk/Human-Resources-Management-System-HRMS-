package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.MailVerificationHistoryService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.mailVerificationHistory;

@RestController
@RequestMapping("/api/mailverificationhistories")
public class MailVerificationHistoriesController {
	
	private MailVerificationHistoryService historyService;
	
	public MailVerificationHistoriesController(MailVerificationHistoryService historyService) {
		this.historyService = historyService;
	}
	
	@GetMapping("/getallmailverificationhistories")
	public DataResult<List<mailVerificationHistory>> getAll(){
		return this.historyService.getAll();
	}
	
	@PostMapping("mailverificationadd")
	public Result add(mailVerificationHistory mailVerificationHistory) {
		return this.historyService.add(mailVerificationHistory);
	}
	
}
