package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.cv.SchoolsAttended;

public interface SchoolAttendedService {
	
	DataResult<List<SchoolsAttended>> getAll();
	
	Result add(SchoolsAttended schoolsAttended);
	Result delete(SchoolsAttended schoolsAttended);
	Result update(SchoolsAttended schoolsAttended);
}
