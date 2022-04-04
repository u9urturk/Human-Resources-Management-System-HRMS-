package kodlama.io.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Hrms.business.abstracts.UserService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entitites.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getallusers")
	public DataResult<List<User>> getAll(){
		
		return this.userService.getAll();
	}
	
	@PostMapping("/adduser")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
		
	}
	
	@GetMapping("/getbyemail")
	@ResponseBody
	public DataResult<User> getByEmail(@RequestParam String email){
		return this.userService.getByEmail(email);
	}
}
