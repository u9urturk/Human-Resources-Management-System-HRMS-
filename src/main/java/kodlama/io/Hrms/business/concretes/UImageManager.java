package kodlama.io.Hrms.business.concretes;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.UImageService;
import kodlama.io.Hrms.core.utilities.UploadImageService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.ErrorResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.ImageDao;
import kodlama.io.Hrms.entitites.concretes.Image;
@Service
public class UImageManager implements UImageService {
	
	private ImageDao imageDao;
	private UploadImageService UIService;
	@Autowired
	public UImageManager(ImageDao imageDao, UploadImageService uIService) {
		super();
		this.imageDao = imageDao;
		UIService = uIService;
	}

	@Override
	public Result uploadImage(File file) throws IOException {
		
		String url = this.UIService.uploadImage(file);
		if(!url.isEmpty()) {
			Image image = new Image();
			image.setImage_url(url);
			image.setUserId(1);
			this.imageDao.save(image);
			return new SuccessResult("Görsel eklendi");
		}else {
			return new ErrorResult("Görsel eklenemedi");
		}
		
		
	}

	@Override
	public DataResult<List<Image>> getAll() {
		
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll());
	}

}
