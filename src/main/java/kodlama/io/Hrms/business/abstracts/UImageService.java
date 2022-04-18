package kodlama.io.Hrms.business.abstracts;

import java.io.File;
import java.io.IOException;
import java.util.List;


import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.Image;

public interface UImageService {
	
	Result uploadImage(File myFile ) throws IOException;
	
	DataResult<List<Image>> getAll();
}
