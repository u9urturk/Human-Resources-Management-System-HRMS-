package kodlama.io.Hrms.api.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
	
	
	@Value("${file.upload-dir}")
	String FILE_DIRECTORY;
	@PostMapping("/upload")
	public  Result uploadImage(@RequestParam("File") MultipartFile file) throws IOException {
		//File file = new File("my_image.jpg");
		File myFile = new File(FILE_DIRECTORY + file.getOriginalFilename());
		myFile.createNewFile();
		FileOutputStream fos=new FileOutputStream(myFile);
		fos.write(file.getBytes());
		fos.close();
		return this.imageService.uploadImage(myFile);
		
	}
	@GetMapping("/getall")
	public DataResult<List<Image>> getAll(){
		return this.imageService.getAll();
	}
}
