package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.CvService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Dtos.concretes.CvDetailDto;
import kodlama.io.Hrms.entitites.concretes.cv.CV;

@RestController
@RequestMapping("/api/cv")
public class CvController {
	
	private CvService cvService;
	
	@Autowired
	public CvController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("getall")
	DataResult<List<CV>> getAll(){
		return this.cvService.getAll();
	}
	@GetMapping("getalldetailsnew")
	DataResult<List<CvDetailDto>> getAllDetailsNEW(){
		return this.cvService.getAllDetailsNEW();
	}
	
	
	@PostMapping("/add")
	Result add(@RequestBody CV cv) {
		
		return this.cvService.add(cv);
	}
	//Result delete(CV cv);
	//Result update(CV cv);
}
