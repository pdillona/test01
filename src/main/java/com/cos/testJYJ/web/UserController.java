package com.cos.testJYJ.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.testJYJ.dimain.user.UserRepository;
import com.cos.testJYJ.web.dto.JoinReqDto;

@Controller
public class UserController {

	private UserRepository userRepository;
	private HttpSession session;
	

	public UserController(UserRepository userRepository, HttpSession session) {
		this.userRepository = userRepository;
		 this.session = session;
	}

	

	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	


	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	

	


	
	@PostMapping("/join")
	public String join(JoinReqDto dto) { 
		
		
		
		userRepository.save(dto.toEntity());
		
		return "redirect:/loginform"; 
	}

	
}

