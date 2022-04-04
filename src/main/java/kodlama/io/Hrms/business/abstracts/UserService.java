package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	DataResult<User> getByEmail(String email);
	
	Result add(User user);
}
