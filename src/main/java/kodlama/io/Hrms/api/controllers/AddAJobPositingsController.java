package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.AddAJobPositingService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.AddAJobPosting;
@RestController
@RequestMapping("/api/addajobpositings")
public class AddAJobPositingsController {
	
	private AddAJobPositingService addAJobPositingService;
	@Autowired
	public AddAJobPositingsController(AddAJobPositingService addAJobPositingService) {
		super();
		this.addAJobPositingService = addAJobPositingService;
	}
	@GetMapping("/getallbystatus")
	public DataResult<List<AddAJobPosting>> getAllByStatus(@RequestParam boolean status){
		return this.addAJobPositingService.getAllByStatus(status);
	}
	
	@GetMapping("/getbyuseridandstatus")
	public DataResult<List<AddAJobPosting>> getByUserIdAndStatus(@RequestParam int userId,@RequestParam boolean status){
		return this.addAJobPositingService.getByUserIdAndStatus(userId, status);
	}
	
	@GetMapping("/getbyuserid")
	public DataResult<List<AddAJobPosting>> getByUserId(@RequestParam int userId){
		return this.addAJobPositingService.getByUserId(userId);
	}
	
	
	@PostMapping("/addajobpositing")
	public Result add(@RequestBody AddAJobPosting addAJobPosting) {
		
		//System.out.println(addAJobPosting.toString());
		return this.addAJobPositingService.add(addAJobPosting);
	}
	
	@GetMapping("/getbystatusandrelasedate")
	public DataResult<List<AddAJobPosting>> getAllSorted(boolean status){
		//System.out.println(status);
		//System.out.println( this.addAJobPositingService.getAllSorted( status).getData().toString());
		return this.addAJobPositingService.getAllSorted(status);
		
		
	}
	//Result delete(AddAJobPosting addAJobPosting);
	//Result update(AddAJobPosting addAJobPosting);

}
