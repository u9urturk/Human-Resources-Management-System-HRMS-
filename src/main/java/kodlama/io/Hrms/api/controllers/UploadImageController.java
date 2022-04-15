package kodlama.io.Hrms.api.controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.UImageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Image;

@RestController
@RequestMapping("/api/uploadImage")
public class UploadImageController {
	
	private UImageService imageService;
	
	@Autowired
	public UploadImageController(UImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@PostMapping("/upload")
	public Result uploadImage(File file ) throws IOException {
		
		return this.imageService.uploadImage(file);
		
	}
	@GetMapping("/getall")
	public DataResult<List<Image>> getAll(){
		return this.imageService.getAll();
	}
}
