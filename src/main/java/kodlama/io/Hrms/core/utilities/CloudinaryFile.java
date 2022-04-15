package kodlama.io.Hrms.core.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;	

@Service
public class CloudinaryFile implements UploadImageService {
	
	Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
			"cloud_name", "dubzmvbcl",
			"api_key", "819172686917126",
			"api_secret", "ks95qme0p_ufCZmzTzw7wcuPB8s",
			"secure", true));
	public  String uploadImage(File file) throws IOException {

		Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		System.out.println(uploadResult.get("url"));
		return uploadResult.get("url").toString();
	}
	
	
	
	
}
