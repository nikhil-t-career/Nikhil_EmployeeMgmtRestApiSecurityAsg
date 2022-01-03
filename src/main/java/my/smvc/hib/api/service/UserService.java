package my.smvc.hib.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.smvc.hib.api.model.User;
import my.smvc.hib.api.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;

	public User saveUser(User user) {

//		String pwd = user.getPassword();
//		String encryptPwd = passwordEncoder.encode(pwd);
//		user.setPassword(encryptPwd);

		return userRepo.save(user);

	}

}
